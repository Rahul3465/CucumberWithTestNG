package com.framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

	public class YouTubeSearchPage
	{
		WebDriver driver;
		public  YouTubeSearchPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(how=How.ID,using="search")
		public WebElement searchTextBox;

		@FindBy(how=How.ID,using ="search-icon-legacy")
		public WebElement searchButton;

		public void navigateToResultPage(String searchString)
		{
			searchTextBox.sendKeys(searchString);
			searchButton.click();
		}
		
		public void navigateToResult()
		{
			searchTextBox.sendKeys("selenium by bakkappa n - YouTube");
			searchButton.click();
		}
	}
