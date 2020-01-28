package com.framework.StepDef;

import java.util.Map;
import java.util.Properties;

import com.framework.Utility.ExcelHandler;
import com.framework.Utility.PropertiesFileReader;
import com.framework.Utility.TestDataHandler;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestdataReadingStepDef
{
	PropertiesFileReader obj = new PropertiesFileReader();
	TestDataHandler testdata = new TestDataHandler();
	
	@Given("^Read test data for testcase_(\\d+)$")
	public void read_test_data_for_testcase_(Integer int1) throws Exception {
		Properties properties = obj.getProperty();
		Map<String, String> TestDataInMap =  ExcelHandler.getTestDataInMap(properties.getProperty("testdatafilepath"), properties.getProperty("sheetname"), "TestCase_001");
		System.out.println(TestDataInMap.get("Skill_7"));
		testdata.setTestDataInMap(TestDataInMap);
	}

	@When("^Read test data for skill two$")
	public void read_test_data_for_skill_two() {
		Map<String, String> testdataInMap = testdata.getTestDataInMap();
		System.out.println(testdataInMap.get("Skill_2"));
	}

	@Then("^Read test data for skill three$")
	public void read_test_data_for_skill_three() {
		Map<String, String> testdataInMap = testdata.getTestDataInMap();
		System.out.println(testdataInMap.get("Skill_3"));
	}
}
