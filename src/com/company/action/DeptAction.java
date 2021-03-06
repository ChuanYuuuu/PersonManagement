package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("deptAction")
@Scope("prototype")
public class DeptAction implements ModelDriven<Dept>,RequestAware{
	@Autowired
	private DeptService deptService;

	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	Map<String,Object> requestMap;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
		
	}

	private Dept deptModel = new Dept();
	@Override
	public Dept getModel() {
		return deptModel;
	}
	
	public String save() {
		return deptService.save(deptModel);

	}

	public String delete() {
		return deptService.delete(deptModel);
	}

	public String update() {
		return deptService.update(deptModel);
	}

	public String findAll() {
		String msg = "error";
		List<Dept> deptList = deptService.findAll();
		if (deptList != null && deptList.size() > 0) {
			requestMap.put("deptListFromServer", deptList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Dept dept = deptService.findById(deptModel.getDeptno());
			if (dept != null) {
				
				if("update".equals(type)){
					ServletActionContext.getRequest().setAttribute("dept", dept);
					return "updateFromFindById";
				}else{
			List<Dept> deptList = new ArrayList<Dept>();
			deptList.add(dept);
			requestMap.put("deptListFromServer", deptList);
			msg = "success";
				}
			}
		return msg;
	}

}
