package com.company.service.dto.vo;

import java.io.Serializable;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;
//vo从前台来的数据
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//程序健壮性
	private Login login;
	private Detail detail;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	public User(Login login, Detail detail) {
		super();
		this.login = login;
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", detail=" + detail + "]";
	}
	
}
