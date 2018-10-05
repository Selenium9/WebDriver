package com.vasu.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library 
{
	public static FirefoxDriver driver;
	String res;
//appLaunch
	public String appLaunch(String url)
	{
	  driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("fail");
			res="Fail";
		}
		return res;
	}
	// appLogin
	public String appLogin(String userName,String password)
	{

		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		//validate
		if (driver.findElement(By.id("welcome")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("fail");
			res="Fail";
		}
		return res;
		
	}
	//empRegistration
	
	//empList
	//appLogout
	//appClose
	
	public static void main(String[] args) 
	{
		Library app=new Library();
		//app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		System.out.println(results);
		System.out.println(app.appLogin("Admin","Admin"));
	}
}
