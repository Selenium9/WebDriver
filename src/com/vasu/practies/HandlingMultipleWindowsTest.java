package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindowsTest 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		//parent window id
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows=driver.getWindowHandles();
		
		for (String child : windows) 
		{
			//System.out.println(child);
			//to give focus to particular windows
			//driver.switchTo().window(child);
			//close
			//driver.close();
			/*if (!parent.equals(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(2000);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}*/
			driver.switchTo().window(child);
			if (!driver.getTitle().equals("NetBanking")) 
			{
				driver.close();
			}
		}
		
	}

}
