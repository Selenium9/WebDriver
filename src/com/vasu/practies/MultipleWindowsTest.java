package com.vasu.practies;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String> windows=driver.getWindowHandles();
		
		/*for (String child : windows) 
		{
			//System.out.println(child);
			driver.switchTo().window(child);
			//driver.close();
			if (!driver.getTitle().equals("Toyo"))
			{
				driver.close();
			}
			
		}*/
		List<String> tabs=new ArrayList<>(windows);
		
		driver.switchTo().window(tabs.get(0));
		driver.close();

	}

}
