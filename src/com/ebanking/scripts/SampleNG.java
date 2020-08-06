package com.ebanking.scripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG 
{
    @BeforeMethod
	public void xyz()
	{
	Assert.assertEquals("Selenium","Selenium");	
	}
	@Test
	public void abc()
	{
		Assert.assertEquals("Testing","Testing");	
	}
	@Test
	public void bcd()
	{
		Assert.assertEquals("Testing12","Testing12");	
	}
	
	@AfterMethod
	public void pqr()
	{
		Assert.assertEquals("Mindqsys","Mindqsys");
	}
}
