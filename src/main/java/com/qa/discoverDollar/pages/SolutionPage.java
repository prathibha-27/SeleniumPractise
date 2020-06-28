package com.qa.discoverDollar.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDoller.commonUtils.CommonMethods;

public class SolutionPage extends BasePage
{
	CommonMethods cm;
	
	@FindBy(css="ul#nav>li:nth-of-type(2)")
	private WebElement solutionLink;
	
	@FindBy(xpath="//section[@id='features']//div[2]//div[1]//a[1]")
	private WebElement learnMore;
	
	@FindBy(xpath="//button[contains(text(),'Click here to know top 10 areas of the overpayment')]")
	private WebElement overPaymentlink;
	
	@FindBy(xpath="//section[@id='contact']//a[1]")
	private WebElement contactsLink;
	
	@FindBy(xpath="//button[contains(text(),'Click here to know top 10 revenue leakage points in retail companies')]")
	private WebElement leakagesLink;
	
	@FindBy(xpath="//section[@id='contact']//a[2]")
	private WebElement contactsLink2;
	
	public SolutionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSolutionLink()
	{
		solutionLink.click();
		cm= new CommonMethods();
		cm.Element(solutionLink);

//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(solutionLink));
	}

	public void ClickOnLearnMore() throws InterruptedException
	{
		learnMore.click();
		Thread.sleep(2000);
	}
	public void overPaymentLink() throws InterruptedException
	{
		overPaymentlink.click();
		Thread.sleep(2000);
	}
	
	public void contactsLink1() throws InterruptedException
	{
		contactsLink.click();
		Thread.sleep(3000);
	}
	
	public void leakageLink() throws InterruptedException
	{
		leakagesLink.click();
		Thread.sleep(3000);
	}
	
	public void contactsLink2()
	{
		contactsLink2.click();
		cm.Element(contactsLink2);
	}
}
