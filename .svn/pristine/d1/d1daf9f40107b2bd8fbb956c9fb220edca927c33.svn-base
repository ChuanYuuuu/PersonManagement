package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.LeaveDao;
import com.company.dao.pojo.Leave;
import com.company.service.iservice.LeaveService;

@Service("leaveService")
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	private LeaveDao leaveDao;

	@Transactional
	@Override
	public String save(Leave t) {
		String msg = "error";
		try {
			leaveDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Leave t) {
		String msg = "error";
		try {
			leaveDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Leave t) {
		String msg = "error";
		try {
			leaveDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Leave> findAll() {
		List<Leave> leaveList = new ArrayList<Leave>();
		try {
			leaveList = leaveDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return leaveList;
	}

	@Transactional(readOnly=true)
	@Override
	public Leave findById(Integer k) {
		Leave leave = null;
		try {
			leave = leaveDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return leave;
	}

	@Override
	public List<Leave> findByEmpno(int empno) {
		List<Leave> leaveList = new ArrayList<Leave>();
		try {
			leaveList = leaveDao.findByEmpno(empno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return leaveList;
	}

}
