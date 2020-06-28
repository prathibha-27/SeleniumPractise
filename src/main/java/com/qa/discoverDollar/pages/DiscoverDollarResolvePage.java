package com.qa.discoverDollar.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDoller.commonUtils.CommonMethods;

public class DiscoverDollarResolvePage extends BasePage
{
	CommonMethods cm;
	
	@FindBy(css="ul#nav>li:nth-of-type(2)")
	private WebElement solutionLink;
	
	@FindBy(xpath="//section[@id='features']//div[3]//div[1]//a[1]")
	private WebElement learnMore;
	
	@FindBy(xpath="//span[contains(text(),'Click here to speak to an expert')]")
	private WebElement expertCall;
	
	public DiscoverDollarResolvePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSolutionLink() throws InterruptedException
	{
		solutionLink.click();
		learnMore.click();
		cm= new CommonMethods();
		cm.Element(learnMore);
//		driver.switchTo().frame(1);
//		 Thread.sleep(3000);
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		 Thread.sleep(3000);
		expertCall.click();
		cm.Element(expertCall);
	}

}
