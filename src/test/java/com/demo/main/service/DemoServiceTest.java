package com.demo.main.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.demo.main.config.BaseTestConfig;
import com.demo.main.model.Demo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { BaseTestConfig.class })
@TransactionConfiguration(transactionManager = "transactionManager")
@Transactional
public class DemoServiceTest {
	@Resource
	private DemoService demoService;

	@Test
	public void testSave() {
		Demo demo = new Demo();
		demo.setName("demo test");
		demoService.save(demo);
		Assert.assertNotNull(demo.getId());
	}

	@Test
	public void testDelete() {
		Demo demo = new Demo();
		demo.setName("demo test");
		demoService.save(demo);
		demoService.delete(demo.getId());
		Assert.assertNull(demoService.findById(demo.getId()));
	}

	@Test
	public void testFindById() {
		Demo demo = new Demo();
		demo.setName("demo test");
		demoService.save(demo);
		Assert.assertNotNull(demoService.findById(demo.getId()));
	}
}
