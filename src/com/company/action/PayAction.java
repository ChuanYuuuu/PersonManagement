package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Pay;
import com.company.service.iservice.PayService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("payAction")
@Scope("prototype")
public class PayAction implements ModelDriven<Pay>,RequestAware{
	@Autowired
	private PayService payService;

	Map<String,Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
		
	}

	private Pay payModel = new Pay();
	@Override
	public Pay getModel() {
		return payModel;
	}
	
	public String save() {
		return payService.save(payModel);

	}

	public String delete() {
		return payService.delete(payModel);
	}

	public String update() {
		return payService.update(payModel);
	}

	public String findAll() {
		String msg = "error";
		List<Pay> payList = payService.findAll();
		if (payList != null && payList.size() > 0) {
			requestMap.put("payListFromServer", payList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Pay pay = payService.findById(payModel.getPayId());
		if (pay != null) {
			
			List<Pay> payList = new ArrayList<Pay>();
			payList.add(pay);
			requestMap.put("payListFromServer", payList);
			msg = "success";
		}
		return msg;
	}
}
