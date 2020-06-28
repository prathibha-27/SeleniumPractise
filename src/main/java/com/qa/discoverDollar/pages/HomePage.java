package com.qa.discoverDollar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.discoverDollar.base.BasePage;
import com.qa.discoverDoller.commonUtils.CommonMethods;

public class HomePage extends BasePage
{
	CommonMethods cm;
	@FindBy(xpath="//i[@class='fa fa-linkedin']//parent::a[@target='blank']")
	private WebElement link;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLinkedln()
	{
		link.click();
		cm=new CommonMethods();
		cm.Element(link);
		
	}

}
