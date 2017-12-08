package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Check;

public interface CheckDao extends BaseDao<Check, Integer>{
	List<Check> findByEmpno(int empno) throws Exception;
}
