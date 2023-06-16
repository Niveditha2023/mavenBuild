package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.App;

public class AppTest {
	@Test
	public void testlogin1() 
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("nivi","nivi@123"));
	}
	
	@Test
	public void testlogin2() 
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("nivi","nivi@123"));
	}
}
