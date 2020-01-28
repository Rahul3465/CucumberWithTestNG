package com.framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YouTubeChannelPage
{
	WebDriver driver;
	public  YouTubeChannelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="abc")
	public WebElement clickonElement;
	
	public String getTitle() throws Exception
	{
		return driver.getTitle();
	}
}
