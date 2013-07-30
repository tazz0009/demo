package com.demo.main.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.main.model.Demo;
import com.demo.main.repository.DemoRepository;
import com.demo.main.service.DemoService;

@Transactional(readOnly = true)
@Service
public class DemoServiceImpl implements DemoService {

	@Resource
	private DemoRepository demoRepository;

	@Override
	@Transactional(readOnly = false)
	public void save(Demo demo) {
		// TODO Auto-generated method stub
		demoRepository.save(demo);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		demoRepository.delete(id);
	}

}
