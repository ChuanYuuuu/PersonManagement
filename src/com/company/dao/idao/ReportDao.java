package com.company.dao.idao;

import java.util.List;

import com.company.service.dto.result.DeptInfoReport;
import com.company.service.dto.result.EmpInfoReport;

public interface ReportDao {
	List<DeptInfoReport> reportDeptInfo() throws Exception;
	List<EmpInfoReport> reportEmpInfo() throws Exception;
}
