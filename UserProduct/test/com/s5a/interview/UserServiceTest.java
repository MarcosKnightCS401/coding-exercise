package com.s5a.interview;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UserServiceTest {

	@Test
	public void testShowNameList() {
		UserService tester = new UserService();
		List<String> userNameList = new ArrayList<String>();
	    assertEquals("Returns userNameList", userNameList, tester.showNameList());
	}

	@Test
	public void testAddName() {
		UserService tester = new UserService();
	    assertEquals("Returns true", true, tester.addName("Marcos"));
	}

}
