$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/DataDrivenTesting.feature");
formatter.feature({
  "name": "Data Driven YouTube Channel name Validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DataDrivenTesting"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Data Driven YouTube Channel name Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Chrome browser with url",
  "keyword": "Given "
});
formatter.step({
  "name": "Search selenium tutorial \"\u003cSearchString\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Channel name",
  "keyword": "And "
});
formatter.step({
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SearchString"
      ]
    },
    {
      "cells": [
        "selenium by bakkappa n - YouTube"
      ]
    },
    {
      "cells": [
        "selenium by bakkappa n - YouTube"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Data Driven YouTube Channel name Validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DataDrivenTesting"
    }
  ]
});
formatter.step({
  "name": "Open Chrome browser with url",
  "keyword": "Given "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.open_Chrome_browser_with_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search selenium tutorial \"selenium by bakkappa n - YouTube\"",
  "keyword": "When "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.search_selenium_tutorial(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Channel name",
  "keyword": "And "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.click_on_Channel_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.validate_channel_name()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Data Driven YouTube Channel name Validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DataDrivenTesting"
    }
  ]
});
formatter.step({
  "name": "Open Chrome browser with url",
  "keyword": "Given "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.open_Chrome_browser_with_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search selenium tutorial \"selenium by bakkappa n - YouTube\"",
  "keyword": "When "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.search_selenium_tutorial(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Channel name",
  "keyword": "And "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.click_on_Channel_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.match({
  "location": "YouTubeChannelValidationsStepDef.validate_channel_name()"
});
formatter.result({
  "status": "passed"
});
});