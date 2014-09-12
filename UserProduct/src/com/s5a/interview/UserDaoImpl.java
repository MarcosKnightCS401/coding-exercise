package com.s5a.interview;

import java.util.List;

public class UserDaoImpl implements UserDao {
 
	@Override
	public List<String> show() {
		return UserCache.userNameList;
	}
 
	@Override
	public boolean add(String username) {
		UserCache.userNameList.add(username);
 
		return true;
	}
}
