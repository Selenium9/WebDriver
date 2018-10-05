package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidtionTest 
{
@Test
public void validation()
{
	/*String data1="Vasu";
	String data2="Vasu Vasu";*/
	/*if (data1.equals(data2))
	{
		System.out.println("Both are equal");
	}else
	{
		System.out.println("Both are not equal");
	}*/
	//String expText="Welcome";
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
	driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	driver.findElement(By.id("btnLogin")).click();
	//String actText=driver.findElement(By.id("welcome")).getText();
	
	//Assert.assertEquals(actText, expText);
	Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	
}
}
