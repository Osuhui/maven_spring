package com.huiwl.mybatisTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.huiwl.dto.User;

public class MybatisTest {

	@Test
	public void test01() throws IOException {

		// 指定全局配置文件
		String resource = "mybatis-config.xml";
		// 读取配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 构建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			// 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
			// 第二个参数：指定传入sql的参数：这里是用户id
			User user = sqlSession.selectOne("getUser", "huiwl");
			System.out.println(user);
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void test02() throws IOException {

		// 指定全局配置文件
		String resource = "mybatis-config.xml";
		// 读取配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 构建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			// 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
			// 第二个参数：指定传入sql的参数：这里是用户id
			List<User> userList = sqlSession.selectList("getUserInfo", "KT009356");
			System.out.println(userList);
		} finally {
			sqlSession.close();
		}
	}

}
