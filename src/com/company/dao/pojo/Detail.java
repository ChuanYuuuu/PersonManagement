package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Detail implements Serializable{

	private static final long serialVersionUID = 1L;
	Integer detailId;
	String realname;
	Date birthday;
	public Detail() {
		// TODO Auto-generated constructor stub
	}
	public Integer getDetailId() {
		return detailId;
	}
	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	public Detail(Integer detailId, String realname, Date birthday) {
		super();
		this.detailId = detailId;
		this.realname = realname;
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "Detail [detailId=" + detailId + ", realname=" + realname + ", birthday=" + birthday + "]";
	}
	
	public Detail(String realname, Date birthday) {
		super();
		this.realname = realname;
		this.birthday = birthday;
	}
	
}
