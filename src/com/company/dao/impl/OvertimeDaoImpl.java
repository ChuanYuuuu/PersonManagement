package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.OvertimeDao;
import com.company.dao.pojo.Overtime;

@Repository("overtimeDao")
public class OvertimeDaoImpl implements OvertimeDao{
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Overtime t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void delete(Overtime t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public void update(Overtime t) throws Exception {
		sessionFactory.getCurrentSession().update(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Overtime> findAll() throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Overtime").list();
	}

	@Override
	public Overtime findById(Integer k) throws Exception {
		return (Overtime) sessionFactory.getCurrentSession().get(Overtime.class, k);
	}

	


}
