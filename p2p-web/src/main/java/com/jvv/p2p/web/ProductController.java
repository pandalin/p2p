package com.jvv.p2p.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jvv.p2p.biz.product.collect.ProductCollect;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Inject
	private ProductCollect productCollect;

	@RequestMapping("/collect")
	@ResponseBody
	public String collect() {

		try {
			productCollect.collect();
		} catch (Exception e) {
			e.printStackTrace();
			return "fali";
		}

		return "suc";
	}
	
	

}
