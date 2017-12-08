package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable{
	private static final long serialVersionUID = 1L;
	private int empno;
	private String ename;
	private String sex;
	private Date birthday;
	private String education;
	private int  jobId;
	private int deptno;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String ename, String sex, Date birthday, String education,int jobId, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.education = education;
		this.jobId = jobId;
		this.deptno = deptno;
	}
	
	public Emp(String ename, String sex, Date birthday, String education, int jobId, int deptno) {
		super();
		this.ename = ename;
		this.sex = sex;
		this.birthday = birthday;
		this.education = education;
		this.jobId = jobId;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sex=" + sex + ", birthday=" + birthday + ", education="
				+ education + ", jobId=" + jobId + ", deptno=" + deptno + "]";
	}
	
	

}
