package com.demo.main.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.main.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class DemoServiceTest {
	@Resource
	private DemoService demoService;
	
	@Test
	public void test(){
		Assert.assertNotNull("DemoService test method's return value must be not null!", demoService.test());
	}
}
