package com.demo.main.repository;

import java.util.List;

import com.demo.main.model.Demo;

public interface DemoRepository {

	void save(Demo demo);
	
	void delete(Integer id);
	
	Demo findById(Integer id);
	
	List<Demo> findByName(String name);

}
