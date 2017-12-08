package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Check;
import com.company.service.iservice.CheckService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("checkAction")
@Scope("prototype")
public class CheckAction implements ModelDriven<Check>, RequestAware {
	@Autowired
	private CheckService checkService;

	private Check checkModel = new Check();

	@Override
	public Check getModel() {
		return checkModel;
	}

	Map<String, Object> requestMap;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;

	}

	public String findAll() {
		String msg = "error";
		List<Check> checkList = checkService.findAll();
		if (checkList != null && checkList.size() > 0) {
			requestMap.put("checkListFromServer", checkList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Check check = checkService.findById(checkModel.getCheckId());
		if (check != null) {
			List<Check> checkList = new ArrayList<>();
			checkList.add(check);
			requestMap.put("checkListFromServer", checkList);
			msg = "success";
		}
		return msg;
	}

	public String findByEmpno() {
		String msg = "error";

		List<Check> checkList = checkService.findByEmpno(checkModel.getEmpno());
		if (checkList != null && checkList.size() > 0) {
			requestMap.put("checkListFromServer", checkList);
			msg = "success";
		}

		return msg;
	}

}
