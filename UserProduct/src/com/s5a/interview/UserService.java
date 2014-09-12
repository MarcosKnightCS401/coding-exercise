package com.s5a.interview;

import java.util.List;

public class UserService {

	UserDaoImpl userDao = new UserDaoImpl();
	
	public List<String> showNameList() {
		return userDao.show();
	}
 
	public boolean addName(String username) {
		userDao.add(username);
 
		return true;
	}
}
