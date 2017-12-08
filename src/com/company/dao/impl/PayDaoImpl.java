package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.PayDao;
import com.company.dao.pojo.Pay;

@Repository("payDao")
public class PayDaoImpl implements PayDao{

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Pay t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(Pay t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(Pay t) throws Exception {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pay> findAll() throws Exception {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Pay").list();
	}

	@Override
	public Pay findById(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return (Pay) sessionFactory.getCurrentSession().get(Pay.class, k);
	}

}
