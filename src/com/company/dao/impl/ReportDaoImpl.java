package com.company.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.DeptInfoReport;
import com.company.service.dto.result.EmpInfoReport;

@Repository("reportDao")
public class ReportDaoImpl implements ReportDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<DeptInfoReport> reportDeptInfo() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		String sql = "SELECT t5.empno,t5.ename,t5.jobid as jobId,t5.dname "
				+ "FROM(SELECT t3.empno,t3.ename,t3.jobid as jobId,t4.dname "
				+ "FROM t_dept t4,(SELECT t1.empno,t2.ename,t2.jobid as jobId,t2.DEPTNO FROM t_emp t2 ,"
				+ "(SELECT empno FROM t_overtime) t1 WHERE t1.empno=t2.empno) t3 "
				+ "WHERE t3.deptno=t4.deptno) t5 GROUP BY t5.dname;";

		SQLQuery sqlQuery = session.createSQLQuery(sql);
		sqlQuery.setResultTransformer(Transformers.aliasToBean(DeptInfoReport.class));
		List<DeptInfoReport> listInfo = sqlQuery.list();
		return listInfo;
	}

	@SuppressWarnings("unchecked")
	public List<EmpInfoReport> reportEmpInfo() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		/*String sql = "SELECT e.empno,e.ename,d.dname,AVG(p1.sal+p1.saladd-p1.salsub) AS avgsal,(p2.sal+p2.SALADD-p2.SALSUB) AS sumsal,(SELECT COUNT(*) FROM t_leave WHERE empno = e.empno AND leavetime >"
				+ "\"2017-10-01\"" + ") AS leaveCount,(SELECT COUNT(*) FROM t_leaveWHERE leavetime >" + "\"2017-10-01\""
				+ ") AS sumLeave,(SELECT COUNT(*) FROM t_overtime WHERE empno = 1 AND overdate >" + "\"2017-10-10\""
				+ ") AS overtimeCount,(SELECT COUNT(*)FROM t_overtime WHERE overdate >" + "\"2017-10-01\""
				+ ") AS overtimeSum FROM t_pay p1,t_pay p2,t_emp e,t_dept d WHERE p2.EMPNO = e.EMPNO = 1 AND d.DEPTNO = e.DEPTNO";*/
		String sql = "SELECT e.empno, e.ename, d.dname, AVG(p1.sal+p1.saladd-p1.salsub) AS avgsal, (p2.sal+p2.SALADD-p2.SALSUB) AS sumsal, (SELECT COUNT(*) FROM t_leave WHERE empno = e.empno AND leavetime > \"2017-10-01\") AS leaveCount, (SELECT COUNT(*) FROM t_leave WHERE leavetime > \"2017-10-01\") AS sumLeave, (SELECT COUNT(*) FROM t_overtime WHERE empno = 1 AND overdate > \"2017-10-10\") AS overtimeCount, (SELECT COUNT(*) FROM t_overtime WHERE overdate > \"2017-10-01\") AS overtimeSum FROM t_pay p1, t_pay p2, t_emp e, t_dept d WHERE p2.EMPNO = e.EMPNO = 1 AND d.DEPTNO = e.DEPTNO";
		System.out.println(sql);
		SQLQuery sqlQuery = session.createSQLQuery(sql);
		sqlQuery.setResultTransformer(Transformers.aliasToBean(EmpInfoReport.class));
		List<EmpInfoReport> listInfo = sqlQuery.list();
		return listInfo;
	}

}
