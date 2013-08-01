package com.demo.main.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.demo.main.model.Demo;
import com.demo.main.repository.DemoRepository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Demo demo) {
		// TODO Auto-generated method stub
		em.persist(demo);
	}

	@Override
	public void delete(Demo demo) {
		// TODO Auto-generated method stub
		em.remove(demo);
	}

	@Override
	public Demo findById(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Demo.class, id);
	}

	@Override
	public List<Demo> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
