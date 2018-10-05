package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTestCases
{
@Test()
public void appLaunch()
{
	System.out.println("App launch");
}
@Test(dependsOnMethods="appLaunch")
public void appLogin()
{
	System.out.println("App Login");
}
@Test(dependsOnMethods="appLogin")
public void appClose()
{
	System.out.println("App Close");
}
}
