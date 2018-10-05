package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("ramesh123");
		driver.findElement(By.id("lastName")).sendKeys("Chennapa");
		
		//driver.findElement(By.id("photofile")).click();
		driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
		/*Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");
		
		Thread.sleep(2000);*/
		
		driver.findElement(By.id("btnSave")).click();
		

	}

}
