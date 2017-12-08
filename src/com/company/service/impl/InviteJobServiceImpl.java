package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.InviteJobDao;
import com.company.dao.pojo.InviteJob;
import com.company.service.iservice.InviteJobService;

@Service("inviteJobService")
public class InviteJobServiceImpl implements InviteJobService {
	@Autowired
	private InviteJobDao inviteJobDao;

	@Transactional
	@Override
	public String save(InviteJob t) {
		String msg = "error";
		try {
			inviteJobDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(InviteJob t) {
		String msg = "error";
		try {
			inviteJobDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(InviteJob t) {
		String msg = "error";
		try {
			inviteJobDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<InviteJob> findAll() {
		List<InviteJob> inviteJobList = new ArrayList<InviteJob>();
		try {
			inviteJobList = inviteJobDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inviteJobList;
	}

	@Transactional(readOnly=true)
	@Override
	public InviteJob findById(Integer k) {
		InviteJob inviteJob = null;
		try {
			inviteJob = inviteJobDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inviteJob;
	}


}
