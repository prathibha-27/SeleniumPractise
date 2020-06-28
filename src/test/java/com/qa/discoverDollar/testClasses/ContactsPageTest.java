package com.qa.discoverDollar.testClasses;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDollar.listeners.ScreenshotListener;
import com.qa.discoverDollar.pages.ContactsPage;
import com.qa.discoverDoller.commonUtils.AppConstants;
import com.qa.discoverDoller.commonUtils.ExcelUtil;

@Listeners(ScreenshotListener.class)
public class ContactsPageTest extends BasePage
{
	ContactsPage cp;
	public ContactsPageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void setUp()
	{
		initialization();
		cp= new ContactsPage();
		
	}
	
	@DataProvider
	public Object[][] getSendMessageTestData() throws InvalidFormatException {
	
		Object data[][] = ExcelUtil.getTestData(AppConstants.SENDMESSAGE_SHEET_PAGE);
		return data;
	}
	@Test(dataProvider="getSendMessageTestData")
	public void ContactsTest(String name,String gmail,String phoneNum,String designation,String company,String comments)
	{
		cp.ClickOnContacts();
		cp.sendMessage(name, gmail, phoneNum, designation, company, comments);
		Assert.assertTrue(false, "message must be sent");// delibrately making false to get the actual screenshot of failed page
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws InterruptedException
	{
		driver.quit();
	}

}
