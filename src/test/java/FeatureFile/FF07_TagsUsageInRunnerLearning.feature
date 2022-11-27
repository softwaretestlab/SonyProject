#if a tag is placed above feature than all the scenarios under it will be running
  @RegressionTesting @SmokeTestings
Feature: tags usage in runner
@FirstScenario @SanityTesting
#if a tag is placed above scenario only that particular scenario will run
  Scenario: tags learning
    Given Tag is called in runner
    Then that particular tag will run
  @SecondScenario @SanityTesting
  Scenario: tags learning two
    Given Tag is called in runner two
    Then that particular tag will run two

