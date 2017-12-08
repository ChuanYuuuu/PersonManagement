package com.company.service.iservice;

import com.company.dao.pojo.Login;
import com.company.service.dto.vo.User;

public interface LoginService {
	String login(Login login);
	String registry(User user);
}
