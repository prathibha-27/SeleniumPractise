package com.qa.discoverDollar.testClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDollar.listeners.ScreenshotListener;
import com.qa.discoverDollar.pages.SolutionPage;

@Listeners(ScreenshotListener.class)
public class SolutionPageTest extends BasePage
{
	SolutionPage sp;
	
	public SolutionPageTest() 
	{
		super();
	}
	
	@BeforeMethod()
	public void setUp()
	{
		initialization();
		sp= new SolutionPage();
	}
	
	@Test(priority=1)
	public void solutionPageTest() throws InterruptedException
	{
		
		sp.ClickOnSolutionLink();
		Reporter.log("clicked on solution link",true);
		Thread.sleep(2000);
		sp.ClickOnLearnMore();
		
	}
	
	@Test(priority=2)
	public void clickOnOverPaymentLink() throws InterruptedException
	{
		sp.ClickOnSolutionLink();
		Thread.sleep(2000);
		sp.ClickOnLearnMore();
		Thread.sleep(2000);
		sp.overPaymentLink();
		Reporter.log("clicked on overpayment link",true);
		Thread.sleep(2000);
		Assert.assertTrue(false, "overpayment link must be clickable"); // asserting to get actual failed screenshot

	}
	
	@Test(priority=3)
	public void clickOnContacts() throws InterruptedException
	{
		sp.ClickOnSolutionLink();
		Thread.sleep(2000);
		sp.ClickOnLearnMore();
		Thread.sleep(2000);
		sp.contactsLink1();
		Reporter.log("clicked on contacts link",true);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public void clickOnLeakagePoints() throws InterruptedException
	{
		sp.ClickOnSolutionLink();
		Thread.sleep(2000);
		sp.ClickOnLearnMore();
		Thread.sleep(2000);
		sp.leakageLink();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=5)
	public void clickOnContacsLink2() throws InterruptedException
	{
		sp.ClickOnSolutionLink();
		Thread.sleep(2000);
		sp.ClickOnLearnMore();
		Thread.sleep(2000);
		sp.contactsLink2();
		Thread.sleep(2000);
		
		
	}


	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
	}
}
