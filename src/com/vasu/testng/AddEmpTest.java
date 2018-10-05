package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmpTest extends OranheHRM
{
@Test
public void emp() throws Exception
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("santho345"); 
	driver.findElement(By.id("lastName")).sendKeys("Selenium"); 
	//driver.findElement(By.id("photofile")).click();

	//Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\ful.exe");
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
}
}
