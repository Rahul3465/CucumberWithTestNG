package com.framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YouTubeResultPage
{
	WebDriver driver;
	public  YouTubeResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Bakkappa N - TheTechie AutomationLaboratory")
	public WebElement clickonElement;
	
	public void navigateToChannel() throws Exception
	{	Thread.sleep(2000);
		clickonElement.click();
		Thread.sleep(6000);
	}
}
