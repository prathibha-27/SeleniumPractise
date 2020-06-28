package com.qa.discoverDollar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDoller.commonUtils.CommonMethods;

public class ContactsPage extends BasePage
{
	CommonMethods cm;
	@FindBy(css="#nav>li:nth-of-type(5)")
	private WebElement contactsLink;
	
	@FindBy(id="form-name")
	private WebElement nameText;
	
	@FindBy(id="form-email")
	private WebElement emailText;
	
	@FindBy(id="form-phone")
	private WebElement phoneText;
	
	@FindBy(id="form-designation")
	private WebElement designationText;
	
	@FindBy(id="form-company")
	private WebElement companyText;
	
	@FindBy(id="form-message")
	private WebElement commentsText;
	
	
	@FindBy(id="form-submit")
	private WebElement sendButton;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnContacts()
	{
		cm=new CommonMethods();
		contactsLink.click();
		cm.Element(contactsLink);
	}
	
	public void sendMessage(String name,String gmail,String phoneNum,String designation,String company,String comments)
	{
		nameText.sendKeys(name);
		emailText.sendKeys(gmail);
		phoneText.sendKeys(phoneNum);
		designationText.sendKeys(designation);
		companyText.sendKeys(company);
		commentsText.sendKeys(comments);
		sendButton.click();
		cm.Element(sendButton);
	}
	

}
