package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyText {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		driver.findElement(By.id("CwYCWc")).sendKeys("Ramesh");
		driver.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("t2dX1c")).sendKeys(Keys.CONTROL+"v");

	}

}
