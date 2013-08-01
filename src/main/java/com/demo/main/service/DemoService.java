package com.demo.main.service;

import com.demo.main.model.Demo;

public interface DemoService {

	Demo findById(Integer id);

	void save(Demo demo);

	void delete(Integer id);
}
