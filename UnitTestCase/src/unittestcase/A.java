package unittestcase;

import org.junit.Assert;
import org.junit.Test;

public class A {
	
	@Test
	public void testcase1() {
		
		int expectedValue = 300;
		
		B b1 = new B();
		
		int actualValue = b1.addNumbers(100, 200);
		
		Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testcase2() {
		
		int expectedValue = 100;
		
		B b1 = new B();
		
		int actualValue = b1.addNumbers(-100, 200);
		
		Assert.assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testcase3() {
		
		int expectedValue = 300;
		
		B b1 = new B();
		
		int actualValue = b1.addNumbers(100100100, 200200200);
		
		Assert.assertEquals(expectedValue, actualValue);
	}

}
