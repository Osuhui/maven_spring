package com.huiwl.aopTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.service.AopService;
import com.huiwl.util.proxy.MyProxy;

public class AopTest {

	String xmlPath = "com/huiwl/aopTest/aop-config.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {
		AopService aopService = applicationContext.getBean("aopServiceId", AopService.class);
		AopService aopProxy = MyProxy.getProxy(aopService);
		aopProxy.addAop();
	}

}
