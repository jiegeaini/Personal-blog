package com.wxdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.userMapper;
import com.wxdemo.pojo.User;
import com.wxdemo.service.dao.UserService;
import com.wxdemo.util.RandomUtils;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	userMapper mapper;
	
	@Override
	public boolean login(User user) {
		boolean bl = true;
		String password = RandomUtils.passwordMd5(user.getPassword());
		user.setPassword(password);
		if (mapper.login(user) == null) {
			bl = false;
		}
		return bl;
	}

}
