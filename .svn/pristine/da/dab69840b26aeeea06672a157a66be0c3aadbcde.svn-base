package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.OvertimeDao;
import com.company.dao.pojo.Overtime;
import com.company.service.iservice.OvertimeService;

@Service("overtimeService")
public class OvertimeServiceImpl implements OvertimeService {

	@Autowired
	private OvertimeDao overtimeDao;

	@Transactional
	@Override
	public String save(Overtime t) {
		String msg = "error";
		try {
			overtimeDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Overtime t) {
		String msg = "error";
		try {
			overtimeDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Overtime t) {
		String msg = "error";
		try {
			overtimeDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Overtime> findAll() {
		List<Overtime> overtimeList = new ArrayList<Overtime>();
		try {
			overtimeList = overtimeDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return overtimeList;
	}

	@Transactional(readOnly=true)
	@Override
	public Overtime findById(Integer k) {
		Overtime overtime = null;
		try {
			overtime = overtimeDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return overtime;
	}

}
