@ExtentReport
Feature: Data Driven YouTube Channel name Validation 
	Scenario Outline: Data Driven YouTube Channel name Validation 
		Given Open Chrome browser with url
		When  Search selenium tutorial "<SearchString>"
		And Click on Channel name
		Then Validate channel name
Examples:
	|SearchString|
	|selenium by bakkappa n - YouTube|
	|selenium by bakkappa n - YouTube|