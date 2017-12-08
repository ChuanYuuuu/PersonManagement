package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.PayDao;
import com.company.dao.pojo.Pay;
import com.company.service.iservice.PayService;

@Service("payService")
public class PayServiceImpl implements PayService {
	@Autowired
	private PayDao payDao;

	@Transactional
	@Override
	public String save(Pay t) {
		String msg = "error";
		try {
			payDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Pay t) {
		String msg = "error";
		try {
			payDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Pay t) {
		String msg = "error";
		try {
			payDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Pay> findAll() {
		List<Pay> payList = new ArrayList<Pay>();
		try {
			payList = payDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return payList;
	}

	@Transactional(readOnly=true)
	@Override
	public Pay findById(Integer k) {
		Pay pay = null;
		try {
			pay = payDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pay;
	}

}
