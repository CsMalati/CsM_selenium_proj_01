Feature: Test Simple Input Field Functionality
  Scenario:
    Given user is navigated to the Selenium Easy homepage
    And click on Start Practising button
    And click on simple form demo option
    When enter a text into the form
    And click on Show Message button
    Then the text you entered will be visible below