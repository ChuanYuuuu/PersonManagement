package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.DeptDao;
import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao deptDao;
	
	@Transactional
	@Override
	public String save(Dept t) {
		String msg = "error";
		try {
			deptDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Dept t) {
		String msg = "error";
		try {
			deptDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Dept t) {
		String msg = "error";
		try {
			deptDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Dept> findAll() {
		List<Dept> deptList = new ArrayList<Dept>();
		try {
			deptList = deptDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deptList;
	}

	@Transactional(readOnly=true)
	@Override
	public Dept findById(Integer k) {
		Dept Dept = null;
		try {
			Dept = deptDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Dept;
	}

}
