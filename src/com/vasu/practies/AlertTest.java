package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://ksrtc.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();//click on ok
		//alt.dismiss();//click on cancel/close
		//alt.getText()//capturing text
		//alt.sendKeys("Vasu");//send information
	}

}
