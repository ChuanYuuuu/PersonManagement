package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.DeptDao;
import com.company.dao.pojo.Dept;

@Repository("deptDao")
public class DeptDaoImpl implements DeptDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	

	@Override
	public void save(Dept t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(Dept t) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	@Override
	public void delete(Dept t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> findAll() throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Dept").list();
	}

	@Override
	public Dept findById(Integer k) throws Exception {
		
		return (Dept) sessionFactory.getCurrentSession().get(Dept.class, k);
	}

}
