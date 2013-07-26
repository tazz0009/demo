package com.demo.main.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.main.repository.DemoRepository;
import com.demo.main.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Resource
	private DemoRepository demoRepository;

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return demoRepository.test();
	}

}
