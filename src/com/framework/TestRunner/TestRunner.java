package com.framework.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "./features",
glue = {"com.framework.StepDef"},
tags={"@CucumberHooks"})
/*tags={"@DataDrivenTesting"}),
plugin= {"pretty", 
		"html:target/site/cucumber-pretty", 
"json:target/cucumber.json"}, 
monochrome=true)*/
public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception
	{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")    
	public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
	}

	//@DataProvider(parallel=true) //to run parallel
	@DataProvider()
	public Object[][] features()
	{
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun=true)
	public void tearDownClass() throws Exception
	{
		testNGCucumberRunner.finish();
	}

}