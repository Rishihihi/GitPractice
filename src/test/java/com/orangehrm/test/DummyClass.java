package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.base.BaseClass;

public class DummyClass extends BaseClass {
	@Test
	public void dummyTest() {
		String title = driver.getTitle();
		assert title.equals("OrangeHRM") : "Test failed - title is not matching";
		System.out.println("Test passed - title is matching");
	}
}
