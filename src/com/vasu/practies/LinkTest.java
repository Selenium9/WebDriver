package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://google.co.in");
		driver.manage().window().maximize();
		
		//capturing all the links by using tagName
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	/*for (int i = 0; i < links.size(); i++) 
	{
		System.out.println(links.get(i).getText());
	}*/
	/*for (WebElement element : links)
	{
		System.out.println(element.getText());
	}*/
	/*for (int i = 0; i < links.size(); i++) 
	{
		if(!links.get(i).getText().isEmpty())
		{
			System.out.println(links.get(i).getText());
		}
		
	}*/
	for (int i = 0; i < links.size(); i++) 
	{
		if(links.get(i).getText().equals("Images"))
		{
			links.get(i).click();
			break;
		}
		
	}
	}

}
