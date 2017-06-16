package com.jvv.p2p.biz.order;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;

import com.jvv.p2p.facade.OrderService;
import com.jvv.p2p.facade.em.ProjectType;
import com.jvv.p2p.facade.request.MyInvestQryRequest;
import com.jvv.p2p.facade.request.MyRepayQryRequest;
import com.jvv.p2p.facade.response.order.MyInvest;
import com.jvv.p2p.facade.response.order.MyRepay;
import com.jvv.p2p.facade.response.order.Tradedetailviewinfo;
import com.jvv.p2p.facade.response.product.ExperienceAppDetail;
import com.jvv.p2p.facade.response.product.Tradeallinfo;
import com.jvv.p2p.integrate.longkin.LkExperienceService;
import com.jvv.p2p.integrate.longkin.LkOrderService;
import com.jvv.p2p.integrate.longkin.LkProductService;

@Named("orderService")
public class OrderServiceImpl implements OrderService {

	@Inject
	private LkOrderService lkOrderService;

	@Inject
	private LkProductService lkProductService;
	@Inject LkExperienceService experienceService;
	
	@Override
	public MyInvest queryMyInvest(MyInvestQryRequest request) throws IOException {
		MyInvest myinvest = lkOrderService.queryMyInvest(request);
		// if suc 再调用查询
		if (myinvest.getResult().isSuc()) {

			List<Tradedetailviewinfo> dvs = myinvest.getTradedetailviewinfotlist().getTradedetailviewinfos().getTradedetailviewinfo();

			if (CollectionUtils.isNotEmpty(dvs)) {
				if(ProjectType.EXPERIENCE.name().equals(request.getTradeType()))  //体验金投资记录
				{
					for (Tradedetailviewinfo dv : dvs) {
						ExperienceAppDetail appDetail = experienceService.experienceappDetail(String.valueOf(dv.getTradeId()));
						if (appDetail.getResult().isSuc()) {
							dv.setExperienceApp(appDetail);
						}

					}
				}else
				{
					for (Tradedetailviewinfo dv : dvs) {
						Tradeallinfo ti = lkProductService.get(dv.getTradeId() + "");
						if (ti.getResult().isSuc()) {
							dv.setTrade(ti.getTradeinfo().getTrade());
							dv.setDemandinfot(ti.getDemandinfo().getDemandinfot());
						}

					}
				}
				
			}
		}

		return myinvest;
	}

	@Override
	public MyInvest queryMyInvesting(MyInvestQryRequest request) throws IOException {
		//TODO 查询状态2 和3 和4的  我的投资列表

		MyInvest myinvest = lkOrderService.queryMyInvest(request);
		// if suc 再调用查询
		if (myinvest.getResult().isSuc()) {

			List<Tradedetailviewinfo> dvs = myinvest.getTradedetailviewinfotlist().getTradedetailviewinfos().getTradedetailviewinfo();

			if (CollectionUtils.isNotEmpty(dvs)) {
				for (Tradedetailviewinfo dv : dvs) {
					Tradeallinfo ti = lkProductService.get(dv.getTradeId() + "");
					if (ti.getResult().isSuc()) {
						dv.setTrade(ti.getTradeinfo().getTrade());
						dv.setDemandinfot(ti.getDemandinfo().getDemandinfot());
					}

				}
			}
		}

		return myinvest;
	}

	@Override
	public MyRepay queryMyRepay(MyRepayQryRequest request) throws IOException {
		return lkOrderService.queryMyRepay(request);

	}

}
