package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.JobDao;
import com.company.dao.pojo.Job;
import com.company.service.iservice.JobService;

@Service("jobService")
public class JobServiceImpl implements JobService {
	@Autowired
	private JobDao jobDao;

	@Transactional
	@Override
	public String save(Job t) {
		String msg = "error";
		try {
			jobDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Job t) {
		String msg = "error";
		try {
			jobDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Job t) {
		String msg = "error";
		try {
			jobDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Job> findAll() {
		List<Job> jobList = new ArrayList<Job>();
		try {
			jobList = jobDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jobList;
	}

	@Transactional(readOnly=true)
	@Override
	public Job findById(Integer k) {
		Job job = null;
		try {
			job = jobDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return job;
	}

}
