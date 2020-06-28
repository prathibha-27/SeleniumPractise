package com.qa.discoverDollar.testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDollar.pages.DiscoverDollarResolvePage;

public class DiscoverDollarResolvePageTest extends BasePage
{
	DiscoverDollarResolvePage d;
	public DiscoverDollarResolvePageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setUp()
	{
		initialization();
		d=new DiscoverDollarResolvePage();
	}
	
	@Test
	public void discoverDollarResolveTest() throws InterruptedException
	{
		d.ClickOnSolutionLink();
		Assert.assertTrue(false, "experct call must be connected");
	}
	

	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
	}

}
