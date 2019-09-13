package com.huiwl.util.factory;

import com.huiwl.service.BeanService;
import com.huiwl.service.impl.BeanServiceImpl;

public class BeanFactory {

	public BeanService createService() {

		return new BeanServiceImpl();

	}

}
