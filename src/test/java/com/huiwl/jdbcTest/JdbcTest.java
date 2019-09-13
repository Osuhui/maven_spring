package com.huiwl.jdbcTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {

	String xmlPath = "com/huiwl/jdbcTest/jdbc-config.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

	@Test
	public void test01() {

		UserDao userDao = applicationContext.getBean("userDaoImpl", UserDao.class);

		userDao.addUserDao("test");
	}

}
