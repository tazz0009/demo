package com.demo.main.repository;

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
public class DemoRepositoryTests {

	@Resource
	private DemoRepository demoRepository;

	@Test
	public void testSave() {
		Demo demo = new Demo();
		demo.setName("rollback false");
		demoRepository.save(demo);
		Assert.assertNotSame("Demo'id must greater than 0", 0, demo.getId());
	}

	@Test
	public void testDelete() {
		Demo demo = new Demo();
		demo.setName("demo test");
		demoRepository.save(demo);
		demoRepository.delete(demo);
		Assert.assertNull("After delete demo, find demo must be null.",
				demoRepository.findById(demo.getId()));
	}

	@Test
	public void testFindById() {
		Demo demo = new Demo();
		demo.setName("demo test");
		demoRepository.save(demo);
		Assert.assertNotNull(demoRepository.findById(demo.getId()));
	}

}
