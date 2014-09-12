package com.s5a.interview;

import java.util.List;

public interface UserDao {
	List<String> show();
	boolean add(String username);
}
