package com.qa.discoverDollar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDollar.listeners.ScreenshotListener;


public class CareersPage extends BasePage
{
	@FindBy(css="#nav>li:nth-of-type(7)")
	private WebElement careersLink;
	
	@FindBy(name="form-name")
	private WebElement nameText;
	
	@FindBy(name="form-email")
	private WebElement emailText;
	
	@FindBy(name="form-phone")
	private WebElement phoneNum;
	
	@FindBy(css=".btn")
	private WebElement sendButton;
	
	public CareersPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails(String name, String email,String num)
	{
		careersLink.click();
		nameText.sendKeys(name);
		emailText.sendKeys(email);
		phoneNum.sendKeys(num);
		sendButton.click();
		
	}

}
