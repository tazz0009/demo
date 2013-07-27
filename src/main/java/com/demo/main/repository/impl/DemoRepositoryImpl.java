package com.demo.main.repository.impl;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.main.repository.DemoRepository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	public int findDemosCountByJdbc() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select count(id) from demos",
				Integer.class);
	}

}
