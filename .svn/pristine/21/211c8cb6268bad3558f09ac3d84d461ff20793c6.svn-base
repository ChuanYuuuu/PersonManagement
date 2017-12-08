package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.InviteJobDao;
import com.company.dao.pojo.InviteJob;

@Repository("inviteJobDao")
public class InviteJobDaoImpl implements InviteJobDao{

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(InviteJob t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void delete(InviteJob t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public void update(InviteJob t) throws Exception {
		sessionFactory.getCurrentSession().update(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InviteJob> findAll() throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from InviteJob").list();
	}

	@Override
	public InviteJob findById(Integer k) throws Exception {
		return (InviteJob) sessionFactory.getCurrentSession().get(InviteJob.class, k);
	}

	
}
