package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
	
	@Test(dataProvider = "data1")
	public void Test(Object x, Object y) {     // here data gets in batches one by one:
		
		System.out.println(x);
		System.out.println(y);
	}
	
	/*
		@DataProvider(name = "data1")
		public Object[][] getData() {
			
			Object[][] obj = new Object[1][2];
			
			obj[0][0] = "test1";
			obj[0][1] = "test2";
			
			return obj;
		}
	*/
	
	@DataProvider(name = "data1")
	public Object[][] getData() {
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "test1";
		obj[0][1] = "test2";
		obj[1][0] = "test3";
		obj[1][1] = "test4";
		
		return obj;
	}
	
}
