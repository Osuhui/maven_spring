package com.huiwl.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.huiwl.dto.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private User user;

	public void addUserDao() {

		System.out.println("addUserDao");
		System.out.println(user);
		System.out.println("....end....");
	}

}
