package com.demo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void testLoginPage() {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.fb.com");
	}
}
