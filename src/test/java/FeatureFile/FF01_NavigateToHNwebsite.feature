@Regression
Feature: HN Homepage
  Scenario: Navigate to HN website
    Given open browser and enter url and navigate to HN website
    Then get title and assert

  @SmokeTesting
    Scenario: Login to webpage
      Given Enter username
      Then Enter password
      And Click on login button
      Then should be on login screen
