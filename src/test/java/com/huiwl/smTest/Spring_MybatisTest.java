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
		List<User> userList = this.userMapper.getUserFromUserName("test");
		System.out.println(userList);
	}

	@Test
	public void test02() {

		User user = new User();
		user.setName("test01");
		user.setPassword("test01");

		// 添加用户
		userMapper.addUser(user);
	}

	@Test
	public void test03() {

		User user = new User();
		user.setId("996223192");
		user.setName("test01");
		user.setPassword("test01");

		// 更新用户
		userMapper.updateUser(user);
	}

	@Test
	public void test04() {

		String userId = "1866476214";
		// 删除用户
		userMapper.deleteUser(userId);
	}

}
