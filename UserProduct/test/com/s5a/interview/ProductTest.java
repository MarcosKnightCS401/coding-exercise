package com.s5a.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void testGetBrandName() {
		Product tester = new Product("Apple");
	    assertEquals("Name must return Marcos", "Apple", tester.getBrandName());
	}

}
