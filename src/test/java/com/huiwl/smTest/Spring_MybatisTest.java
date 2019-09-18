package com.huiwl.smTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huiwl.dao.UserMapper;
import com.huiwl.dto.User;

//目标：测试一下spring的bean的某些功能
@RunWith(SpringJUnit4ClassRunner.class) // junit整合spring的测试//立马开启了spring的注解
@ContextConfiguration(locations = "classpath:spring-mybatis.xml") // 加载核心配置文件，自动构建spring容器
public class Spring_MybatisTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test01() {
		List<User> userList = this.userMapper.getUserFromGroupCd("T");
		System.out.println(userList);
	}

}
