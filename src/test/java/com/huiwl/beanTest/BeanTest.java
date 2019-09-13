package com.huiwl.beanTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huiwl.service.BeanService;

public class BeanTest {

	String xmlPath = "com/huiwl/beanTest/bean.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {

		BeanService beanService = applicationContext.getBean("GenaralBean", BeanService.class);
		// 普通bean
		beanService.addGenaralBean();
	}

	@Test
	public void test02() {

		BeanService beanService = applicationContext.getBean("StaticBeanFactory", BeanService.class);
		// 静态工厂
		beanService.addStaticBeanFactory();
	}

	@Test
	public void test03() {

		BeanService beanService = applicationContext.getBean("BeanService", BeanService.class);
		// 实例工厂
		beanService.addBeanFactory();
	}

}
