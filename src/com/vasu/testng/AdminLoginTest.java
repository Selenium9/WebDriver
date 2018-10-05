package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminLogin()
{
	String userName="Admin";
	String password="Admin";
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtUsername")).sendKeys(userName);
	
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	
	driver.findElement(By.id("btnLogin")).click();
}
}
