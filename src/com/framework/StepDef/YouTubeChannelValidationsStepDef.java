package com.framework.StepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.framework.Listeners.ExtentReportListener;
import com.framework.PageObjects.YouTubeChannelPage;
import com.framework.PageObjects.YouTubeResultPage;
import com.framework.PageObjects.YouTubeSearchPage;
import com.framework.Utility.BrowserUtility;
import com.framework.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class YouTubeChannelValidationsStepDef extends ExtentReportListener
{
	PropertiesFileReader obj = new PropertiesFileReader();
	private WebDriver driver;

	@Given("^Open Chrome browser with url$")
	public void open_Chrome_browser_with_url() throws Exception {
		ExtentTest logInfo = null;
		try{
			test = extent.createTest(Feature.class,"Data Driven YouTube Channel name Validation");
			test = test.createNode(Scenario.class,"Data Driven YouTube Channel name Validation");
			logInfo = test.createNode(new GherkinKeyword("Given"),"Open Chrome browser with url");
			Properties properties = obj.getProperty();
			driver = BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("brower.baseUrl"));
			logInfo.pass("Opened Chrome Browser and entered url");
			//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		}
		catch(AssertionError | Exception e)
		{
			testStepHandle("FAIL",driver,logInfo,e);
			
		}
	}

	@When("^Search selenium tutorial \"([^\"]*)\"$")
	public void search_selenium_tutorial(String searchString) throws Exception {
		ExtentTest logInfo = null;
		try{
			logInfo = test.createNode(new GherkinKeyword("When"),"Search selenium tutorial");
			new YouTubeSearchPage(driver).navigateToResultPage(searchString);
			logInfo.pass("Searching selenium tutorial");
			//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		}
		catch(AssertionError | Exception e)
		{
			testStepHandle("FAIL",driver,logInfo,e);
		}
	}
	
	@When("^Search selenium tutorial$")
	public void search_selenium_tutorial() throws Exception {
		ExtentTest logInfo = null;
		try{
			logInfo = test.createNode(new GherkinKeyword("When"),"Search selenium tutorial");
			new YouTubeSearchPage(driver).navigateToResult();
			logInfo.pass("Searching selenium tutorial");
			//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		}
		catch(AssertionError | Exception e)
		{
			testStepHandle("FAIL",driver,logInfo,e);
		}
	}

	@Then("^Click on Channel name$")
	public void click_on_Channel_name() throws Exception {
		ExtentTest logInfo = null;
		try{
			logInfo = test.createNode(new GherkinKeyword("Then"),"Click on Channel name");
			new YouTubeResultPage(driver).navigateToChannel();
			logInfo.pass("Clicked on Channel name");
			//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		}
		catch(AssertionError | Exception e)
		{
			testStepHandle("FAIL",driver,logInfo,e);
		}
	}

	@Then("^Validate channel name$")
	public void validate_channel_name() throws Exception {
		ExtentTest logInfo = null;
		try{
			logInfo = test.createNode(new GherkinKeyword("Then"),"Validate channel name");
			String expectedChannelName="Bakkappa N - TheTechie AutomationLaboratory - YouTube";
			String actualChannelName = new YouTubeChannelPage(driver).getTitle();
			Assert.assertEquals(expectedChannelName, actualChannelName,"Channel names are not matching");
			logInfo.pass("Validated channel name");
			//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			driver.quit();
		}
		catch(AssertionError | Exception e)
		{
			testStepHandle("FAIL",driver,logInfo,e);
		}
	}
}
