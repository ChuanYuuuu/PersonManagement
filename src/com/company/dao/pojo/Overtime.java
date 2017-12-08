package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Overtime implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int overId;
	private int empno;
	private Date overDate;
	private String overReason;
	
	
	public Overtime() {
		// TODO Auto-generated constructor stub
	}


	public Overtime(int overId, int empno, Date overDate, String overReason) {
		super();
		this.overId = overId;
		this.empno = empno;
		this.overDate = overDate;
		this.overReason = overReason;
	}


	public int getOverId() {
		return overId;
	}


	public void setOverId(int overId) {
		this.overId = overId;
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public Date getOverDate() {
		return overDate;
	}


	public void setOverDate(Date overDate) {
		this.overDate = overDate;
	}


	public String getOverReason() {
		return overReason;
	}


	public void setOverReason(String overReason) {
		this.overReason = overReason;
	}


	@Override
	public String toString() {
		return "Overtime [overId=" + overId + ", empno=" + empno + ", overDate=" + overDate + ", overReason="
				+ overReason + "]";
	}

	
	
	

}
