package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Leave implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int leaveId;
	private int empno;
	private Date leaveTime;
	private String leaveReason;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(int leaveId, int empno, Date leaveTime, String leaveReason) {
		super();
		this.leaveId = leaveId;
		this.empno = empno;
		this.leaveTime = leaveTime;
		this.leaveReason = leaveReason;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Date getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", empno=" + empno + ", leaveTime=" + leaveTime + ", leaveReason="
				+ leaveReason + "]";
	}
	
	
	
}
