package com.company.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.EmpDao;
import com.company.dao.pojo.Emp;

@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	

	@Override
	public void save(Emp t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(Emp t) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	@Override
	public void delete(Emp t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> findAll() throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Emp").list();
	}

	@Override
	public Emp findById(Integer k) throws Exception {
		
		return (Emp) sessionFactory.getCurrentSession().get(Emp.class, k);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> findByName(String ename) throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Emp  where ename like :ename").setParameter("ename", "%"+ename+"%").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> findByDname(String dname) throws Exception {
		String sql = "select e.empno,e.ename,e.sex,e.birthday,e.education,e.jobid,e.deptno from t_emp e where e.deptno=(select d.deptno from t_dept d where d.dname="+'"'+dname+'"'+")";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		query.addScalar("empno");
		query.addScalar("ename");
		query.addScalar("sex");
		query.addScalar("birthday");
		query.addScalar("education");
		query.addScalar("jobId");
		query.addScalar("deptno");
		query.setResultTransformer(Transformers.aliasToBean(Emp.class));
		return query.list();
	}

}
