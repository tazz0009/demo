package com.demo.main.repository;

public interface DemoRepository {
	String test();

	/**
	 * 通过jdbc，查询demo的总数据数
	 * 
	 * @return Integer
	 */
	int findDemosCountByJdbc();
}
