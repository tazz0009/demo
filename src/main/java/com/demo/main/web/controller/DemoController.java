package com.demo.main.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.main.service.DemoService;

@Controller
@RequestMapping("/demos")
public class DemoController {

	@Resource
	private DemoService demoService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		System.out.println(demoService.test());
		return "/demos/test";
	}
	
}
