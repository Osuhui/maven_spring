package com.huiwl.mybatisTest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.huiwl.dto.User;

public class MybatisTest {

	// 指定全局配置文件
	String resource = "com/huiwl/mybatisTest/mybatis-config.xml";


	@Test
	public void test01() throws IOException {

		// 读取配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 构建sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取sqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			// 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
			// 第二个参数：指定传入sql的参数：这里是用户id
			User user = sqlSession.selectOne("getUserFromUserName", "huiwl");
			System.out.println(user);
		} finally {
			sqlSession.close();
		}
	}

}
