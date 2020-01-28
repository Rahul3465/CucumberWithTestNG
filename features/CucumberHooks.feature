@CucumberHooks
Feature: YouTube Channel name Validation 
	@TestCase1
	Scenario: YouTube Channel name Validation 
		Given Open Chrome browser with url
		When  Search selenium tutorial
		And Click on Channel name
		Then Validate channel name

	@TestCase2
	Scenario: Channel name Validation 
		Given Open Chrome browser with url
		When  Search selenium tutorial
		And Click on Channel name
		Then Validate channel name