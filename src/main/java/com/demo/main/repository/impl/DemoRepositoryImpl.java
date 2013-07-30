package com.demo.main.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.demo.main.model.Demo;
import com.demo.main.repository.DemoRepository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public void save(Demo demo) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(demo);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(em.find(Demo.class, id));
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
	}

	@Override
	public Demo findById(Integer id) {
		// TODO Auto-generated method stub
		return emf.createEntityManager().find(Demo.class, id);
	}

	@Override
	public List<Demo> findByName(String name) {
		// TODO Auto-generated method stub
		Query query = emf.createEntityManager().createQuery("select * from Demo d where d.name:=name");
		query.setParameter("name", name);
		return null;
	}

}
