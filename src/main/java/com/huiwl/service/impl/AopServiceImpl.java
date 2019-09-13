package com.huiwl.service.impl;

import org.springframework.stereotype.Service;

import com.huiwl.service.AopService;

@Service("aopService")
public class AopServiceImpl implements AopService {
	
	public void addAop() {
		System.out.println("addAop");
	}


}
