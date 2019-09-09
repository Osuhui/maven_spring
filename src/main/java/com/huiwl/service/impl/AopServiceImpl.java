package com.huiwl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiwl.dao.UserDaoImpl;
import com.huiwl.service.UserService;

@Service("aopService")
public class AopServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDao;

	public void addGenaralBean() {

		System.out.println("add genaral beans");

	}

	public void addStaticBeanFactory() {

		System.out.println("add Static BeanFactory");

	}

	public void addBeanFactory() {

		System.out.println("add BeanFactory");

	}

	@Override
	public void addUser() {

		System.out.println("addUserService");
		userDao.addUserDao();
	}

}
