package com.qa.discoverDollar.testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDollar.listeners.ScreenshotListener;
import com.qa.discoverDollar.pages.CareersPage;

@Listeners(ScreenshotListener.class)
public class CareersPageTest extends BasePage{

	CareersPage cp;
	public CareersPageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setUp()
	{
		initialization();
		cp= new CareersPage();
	}
	
	@Test
	public void enterDetails()
	{
		cp.enterDetails("prathibha", "abcd@gmail.com","-23444");
		Assert.assertTrue(false, "confirmation message should be displayed");
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws InterruptedException
	{
		driver.quit();
	}
}
