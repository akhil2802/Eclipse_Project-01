package testng;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	/*
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");        // runs before all the tests
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test");        // runs after all the tests
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");     // runs before every method run
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");      // runs after every method run
	}
	*/
}
