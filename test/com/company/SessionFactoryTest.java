package com.company;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SessionFactoryTest {

	ApplicationContext ctx;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSessionFactoryFromIOC() throws Exception {
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());
		SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();
		System.out.println(session);
		session.close();
		sessionFactory.close();
	}
}
