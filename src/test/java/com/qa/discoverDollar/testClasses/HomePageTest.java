package com.qa.discoverDollar.testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDollar.listeners.ScreenshotListener;
import com.qa.discoverDollar.pages.HomePage;

@Listeners(ScreenshotListener.class)
public class HomePageTest extends BasePage
{
	HomePage hp;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod()
	public void setUp()
	{
		initialization();
		hp=new HomePage();
	}
	
	@Test()
	public void homePageTest() throws InterruptedException
	{
		hp.ClickOnLinkedln();
		Assert.assertTrue(false, "linkedln profile should be opened");
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws InterruptedException
	{
		
		driver.quit();
	}
}
