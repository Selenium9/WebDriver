package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Amazon.in");
		driver.manage().window().maximize();
		
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select slt=new Select(drop);
	slt.selectByIndex(25);
	//slt.selectByValue("search-alias=beauty");
	//slt.selectByVisibleText("Books");
	/*List<WebElement> dropList=slt.getOptions();
System.out.println(dropList.size());*/
	//
	//System.out.println(slt.isMultiple());//true /false
	//System.out.println(slt.getFirstSelectedOption().getText());
	
List<WebElement> list=slt.getAllSelectedOptions();
System.out.println(list.size());
for (WebElement element : list)
{
	System.out.println(element.getText());
}
	

	}

}
