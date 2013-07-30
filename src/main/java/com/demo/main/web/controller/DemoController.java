package com.demo.main.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.main.model.Demo;
import com.demo.main.service.DemoService;

@Controller
@RequestMapping("/demos")
public class DemoController {

	@Resource
	private DemoService demoService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		return "/demos/test";
	}
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(){
		Demo demo = new Demo();
		demo.setName("lijing");
		demoService.save(demo);
		return "redirect:/demos/test";
	}
	
}
