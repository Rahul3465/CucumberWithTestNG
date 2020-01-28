package com.framework.StepDef;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.framework.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeStepDef
{
	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();
	
	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Exception
	{
		Properties properties = obj.getProperty();
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("brower.baseUrl"));
		Thread.sleep(3000);
	}
	
	@When("^Enter search criteria$")
	public void enter_search_criteria() throws Exception
	{
		driver.findElement(By.id("search")).sendKeys("selenium c# by bakkappa n");
		Thread.sleep(1000);
	}
	
	@Then("^Click on search button$")
	public void click_on_search_button() throws Exception
	{
		driver.findElement(By.cssSelector("#search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
