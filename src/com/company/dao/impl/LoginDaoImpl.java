package com.company.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public String login(Login login) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Object obj = session.createQuery("from Login log where log.username=? and log.password=?")
		.setParameter(0, login.getUsername())
		.setParameter(1, login.getPassword())
		.uniqueResult();
		return obj==null?"error":"success";
	}

	@Override
	public void registry(Login login, Detail detail) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(login);
		session.save(detail);
	}

}
