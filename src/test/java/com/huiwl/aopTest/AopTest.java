package com.huiwl.aopTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.service.AopService;
import com.huiwl.service.impl.AopServiceImpl;
import com.huiwl.util.proxy.CglibProxy;
import com.huiwl.util.proxy.JdkProxy;

public class AopTest {

	String xmlPath = "com/huiwl/aopTest/aop-config.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void testJdkProxy() {
		AopService aopService = applicationContext.getBean("aopServiceId", AopService.class);
		AopService aopProxy = JdkProxy.getProxy(aopService);
		aopProxy.addAop();
	}

	@Test
	public void testCglibProxy() {
		AopServiceImpl aopService = CglibProxy.createProxy();
		aopService.addAop();
	}

	@Test
	public void testSpringProxy() {
		AopService aopService = applicationContext.getBean("aopServiceId", AopService.class);
		aopService.addAop();
	}


}
