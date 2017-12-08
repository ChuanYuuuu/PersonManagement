package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.JobDao;
import com.company.dao.pojo.Job;

@Repository("jobDao")
public class JobDaoImpl implements JobDao{

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Job t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(Job t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(Job t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Job> findAll() throws Exception {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Job").list();
	}

	@Override
	public Job findById(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return (Job) sessionFactory.getCurrentSession().get(Job.class, k);
	}

}
