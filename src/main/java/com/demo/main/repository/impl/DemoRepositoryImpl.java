package com.demo.main.repository.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.demo.main.repository.DemoRepository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	public int findAllDemosCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
