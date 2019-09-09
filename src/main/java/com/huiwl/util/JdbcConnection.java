package com.huiwl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component("jdbcConnection")
public class JdbcConnection {

	private static String ORACLE_DRIVAER = "oracle.jdbc.OracleDriver";

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private String name = "TESTER";
	private String password = "TESTER";

	public Connection jdbcConnetion() {

		Connection con = null;
		try {

			System.out.println("---------------Link Start---------------");

			// 加载Oracle驱动
			Class.forName(ORACLE_DRIVAER);

			//获取连接
			con = DriverManager.getConnection(url, name, password);

			System.out.println("---------------Connection Successful---------------");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}

	public void jdbcClose(ResultSet rs, PreparedStatement ps, Connection con) {

		try {

			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();
			}

			if (con != null) {
				con.close();
				System.out.println("---------------Disconnection Link---------------");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
