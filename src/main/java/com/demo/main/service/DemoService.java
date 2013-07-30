package com.demo.main.service;

import com.demo.main.model.Demo;


public interface DemoService {
	
	void save(Demo demo);
	
	void delete(Integer id);
}
