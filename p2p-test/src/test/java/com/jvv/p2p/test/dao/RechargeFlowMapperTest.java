package com.jvv.p2p.test.dao;

import com.jvv.p2p.dao.RechargeFlowDtoMapper;
import com.jvv.p2p.entity.RechargeFlowDto;
import com.jvv.p2p.test.BaseTest;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.inject.Inject;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by cx on 2015/5/25.
 */
public class RechargeFlowMapperTest extends BaseTest {

    @Inject
    private RechargeFlowDtoMapper rechargeFlowMapper;

    @Test
    @Rollback(false)
    public void testInsertSelective()  {

        RechargeFlowDto rf=new RechargeFlowDto();
        rf.setId(UUID.randomUUID().toString());
        rf.setExtUserId("1");
        rf.setAmonut(BigDecimal.TEN);
        rf.setExtFlowno("test1");

        rechargeFlowMapper.insertSelective(rf);
    }


}