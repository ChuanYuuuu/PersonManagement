package com.company.dao.pojo;

import java.io.Serializable;

public class Dept implements Serializable{
	private static final long serialVersionUID = 1L;
	private int deptno;
	private String dname;
	private String ddesc;
	private String managerName;
	
	public Dept() {
		// TODO Auto-generated constructor stub
	}

	public Dept(int deptno, String dname, String ddesc, String managername) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.ddesc = ddesc;
		this.managerName = managername;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}


	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managername) {
		this.managerName = managername;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", ddesc=" + ddesc
				+ ", managerName=" + managerName + "]";
	}

	
}
