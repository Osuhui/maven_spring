package com.huiwl.service.impl;

import org.springframework.stereotype.Service;

import com.huiwl.service.BeanService;

@Service("addBean")
public class BeanServiceImpl implements BeanService {

	public void addGenaralBean() {

		System.out.println("add genaral beans");

	}

	public void addStaticBeanFactory() {

		System.out.println("add Static BeanFactory");

	}

	public void addBeanFactory() {

		System.out.println("add BeanFactory");

	}

}
