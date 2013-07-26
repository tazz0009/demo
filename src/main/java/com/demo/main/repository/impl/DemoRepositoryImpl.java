package com.demo.main.repository.impl;

import org.springframework.stereotype.Repository;

import com.demo.main.repository.DemoRepository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "test";
	}

}
