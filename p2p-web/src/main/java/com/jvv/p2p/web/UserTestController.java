package com.jvv.p2p.web;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jvv.p2p.biz.user.UserDtoService;
import com.jvv.p2p.entity.ExtUserDto;
import com.jvv.portal.facade.JvvTaskFacade;

@Controller
@RequestMapping("/test")
public class UserTestController {

	@Inject
	private UserDtoService userDtoService;
	@Inject
	@Qualifier("jvvTaskFacadeWs")
	private JvvTaskFacade jvvTaskFacade;

	@RequestMapping("/product/buy/{extUserId}")
	public ModelAndView testPay(@PathVariable String extUserId) {
		ModelAndView mv = new ModelAndView("/2.jsp");

		ExtUserDto user = userDtoService.get(extUserId);
		jvvTaskFacade.userCompleteOnceTask(user.getUserId(), 3);
		return mv;
	}

}
