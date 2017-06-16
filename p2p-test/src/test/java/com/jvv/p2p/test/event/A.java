package com.jvv.p2p.test.event;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.jvv.p2p.entity.TradeFlowDto;
import com.jvv.p2p.facade.vo.User;

public class A {

	public static void main(String[] args) {

		EventBus eb = new EventBus("login");
		DtoService ds = new DtoService();
		eb.register(ds);
		
		User u = new User();
		u.setPhone("136ax");
		eb.post(u);
		
		String s="abc";
		eb.post(s);
	
		eb.post(new TradeFlowDto());
	}
	
	

}

class DtoService {

	private Log log = LogFactory.getLog(this.getClass());

	@Subscribe
	public void a(User u) {

		log.debug("a"+u.getPhone());

	}
	
	@Subscribe
	public void b(User u) {

		log.debug("b"+u.getPhone());

	}
	@Subscribe
	public void d(DeadEvent e){
		
		log.debug(ToStringBuilder.reflectionToString(e));
	}
	

	@Subscribe
	public void c(String s) {

		log.debug("c"+s);

	}
}
