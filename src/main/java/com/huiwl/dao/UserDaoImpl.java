package com.huiwl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.huiwl.dto.User;
import com.huiwl.util.JdbcConnection;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private User user;

	@Autowired
	private JdbcConnection jdbcConnection;

	// 声明
//	private Statement statement;

	// 预编译
	private PreparedStatement ps;

	// 结果集
	private ResultSet rs;

	public void addUserDao() {

		// 连接Oracle
		Connection con = jdbcConnection.jdbcConnetion();

		// SQL语句
		String sql = "select USER_ID,USER_NAME,USER_PWD from USER_INFO where USER_NAME = ?";
		String userName = "huiwl";

		try {

			// 方式一：不带参数
//			statement = con.createStatement();
//			rs = statement.executeQuery(sql);

			//方式二：带参数
			ps = con.prepareStatement(sql);

			//设置参数
			ps.setString(1, userName);

			// 执行SQL
			rs = ps.executeQuery();

			// 处理返回集
			while (rs.next()) {
				user.setId(rs.getString("USER_ID"));
				user.setName(rs.getString("USER_NAME"));
				user.setPassword(rs.getString("USER_PWD"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcConnection.jdbcClose(rs,ps,con);
		}
		System.out.println("addUserDao");
		System.out.println(user);
		System.out.println("....end....");
	}

}
