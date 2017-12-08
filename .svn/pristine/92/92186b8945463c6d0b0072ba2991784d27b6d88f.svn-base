package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.InviteJob;
import com.company.service.iservice.InviteJobService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("inviteJobAction")
@Scope("prototype")
public class InviteJobAction implements ModelDriven<InviteJob>,RequestAware{
	@Autowired
	private InviteJobService inviteJobService;

	Map<String,Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
		
	}

	private InviteJob inviteJobModel = new InviteJob();
	@Override
	public InviteJob getModel() {
		return inviteJobModel;
	}
	
	public String save() {
		return inviteJobService.save(inviteJobModel);

	}

	public String delete() {
		return inviteJobService.delete(inviteJobModel);
	}

	public String update() {
		return inviteJobService.update(inviteJobModel);
	}

	public String findAll() {
		String msg = "error";
		List<InviteJob> inviteJobList = inviteJobService.findAll();
		System.out.println(inviteJobList);
		if (inviteJobList != null && inviteJobList.size() > 0) {
			requestMap.put("inviteJobListFromServer", inviteJobList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		InviteJob inviteJob = inviteJobService.findById(inviteJobModel.getInviteId());
		if (inviteJob != null) {
			
			List<InviteJob> inviteJobList = new ArrayList<InviteJob>();
			inviteJobList.add(inviteJob);
			requestMap.put("inviteJobListFromServer", inviteJobList);
			msg = "success";
		}
		return msg;
	}

}
