@UATTesting2
Feature: YouTube Channel name Validation 
	Scenario: YouTube Channel name Validation 
		Given Open Chrome browser with url
		When  Search selenium tutorial
		And Click on Channel name
		Then Validate channel name
