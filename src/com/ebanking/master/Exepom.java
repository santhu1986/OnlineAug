package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	
	WebDriver driver;
     @BeforeTest
	public void Launch() throws InterruptedException
	{
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
	}
     @Test(dataProvider="Adm")
     public void Login(String Uname,String Pswd) throws InterruptedException
     {
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.Login(Uname,Pswd);
		
		
     }
     @AfterTest
     public void Rcre() throws InterruptedException {
    	 
     
		Thread.sleep(3000);
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
	}
@DataProvider
public Object [][] Adm()
{
	Object [][] Obj=new Object[1][2];
	
	
	Obj[0][0]="Admin";
    Obj[0][1]="M1ndq";			
			
    return Obj;

}

}
