package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.DeptInfoReport;
import com.company.service.dto.result.EmpInfoReport;
import com.company.service.iservice.ReportService;
import com.google.gson.Gson;

@Service("reportService")
public class ReportServiceImpl implements ReportService{

	@Autowired
	private ReportDao reportDao;
	
	@Transactional
	@Override
	public String reportDeptInfo() {
		List<DeptInfoReport> reportList = null;
		String jsonStr = "";
		try {
			reportList = reportDao.reportDeptInfo();
			Gson gson = new Gson();
			jsonStr = gson.toJson(reportList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonStr;
	}
	@Transactional
	@Override
	public String reportEmpInfo() {
		List<EmpInfoReport> reportList = null;
		String jsonStr = "";
		try {
			reportList = reportDao.reportEmpInfo();
			Gson gson = new Gson();
			jsonStr = gson.toJson(reportList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonStr;
	}

}
