package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Leave;
import com.company.service.iservice.LeaveService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("leaveAction")
@Scope("prototype")
public class LeaveAction implements ModelDriven<Leave>,RequestAware{
	@Autowired
	private LeaveService leaveService;

	Map<String,Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
		
	}

	private Leave leaveModel = new Leave();
	@Override
	public Leave getModel() {
		return leaveModel;
	}
	
	public String save() {
		return leaveService.save(leaveModel);

	}

	public String delete() {
		return leaveService.delete(leaveModel);
	}

	public String update() {
		return leaveService.update(leaveModel);
	}

	public String findAll() {
		String msg = "error";
		List<Leave> leaveList = leaveService.findAll();
		if (leaveList != null && leaveList.size() > 0) {
			requestMap.put("leaveListFromServer", leaveList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Leave leave = leaveService.findById(leaveModel.getLeaveId());
		if (leave != null) {
			
			List<Leave> leaveList = new ArrayList<Leave>();
			leaveList.add(leave);
			requestMap.put("leaveListFromServer", leaveList);
			msg = "success";
		}
		return msg;
	}
	public String findByEmpno() {
		String msg = "error";
		List<Leave> leaveList = leaveService.findByEmpno(leaveModel.getEmpno());
		if (leaveList != null && leaveList.size() > 0) {
			requestMap.put("leaveListFromServer", leaveList);
			msg = "success";
		}
		return msg;
	}


}
