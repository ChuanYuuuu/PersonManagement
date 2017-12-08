package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.company.dao.pojo.Overtime;
import com.company.service.iservice.OvertimeService;
import com.opensymphony.xwork2.ModelDriven;
@Controller("overtimeAction")
@Scope("prototype")
public class OvertimeAction implements ModelDriven<Overtime>,RequestAware{
	@Autowired
	private OvertimeService overtimeService;

	Map<String,Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
		
	}

	private Overtime overtimeModel = new Overtime();
	@Override
	public Overtime getModel() {
		return overtimeModel;
	}
	
	public String save() {
		return overtimeService.save(overtimeModel);

	}

	public String delete() {
		return overtimeService.delete(overtimeModel);
	}

	public String update() {
		return overtimeService.update(overtimeModel);
	}

	public String findAll() {
		String msg = "error";
		List<Overtime> overtimeList = overtimeService.findAll();
		if (overtimeList != null && overtimeList.size() > 0) {
			requestMap.put("overtimeListFromServer", overtimeList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Overtime overtime = overtimeService.findById(overtimeModel.getOverId());
		if (overtime != null) {
			
			List<Overtime> overtimeList = new ArrayList<Overtime>();
			overtimeList.add(overtime);
			requestMap.put("overtimeListFromServer", overtimeList);
			msg = "success";
		}
		return msg;
	}
}
