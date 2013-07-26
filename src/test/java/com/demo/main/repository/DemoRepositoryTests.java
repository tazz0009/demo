package com.demo.main.repository;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.main.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class DemoRepositoryTests {

	@Resource
	private DemoRepository demoRepository;

	@Test
	public void test() {
		assert "test" == demoRepository.test();

	}

}
