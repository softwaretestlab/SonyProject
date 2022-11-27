Feature: This is Third feature



  Scenario: This is Fifth Scenario
    Given this is Fifth given
    Then This is Fifth then

  Scenario: This is Sixth Scenario
    Given this is Sixth given
    Then This is Sixth then


#  // these Before and After hooks will run for each scenario in the featureFIle
#  Before
#  Scenario
#  After
#  //Based on the order Before and After hooks will run for each scenario in the featureFIle
#  Before(order=0)
#  Before(order=1)
#  Before
#  Scenario
#  After
#  After(order=0)
#  After(order=1)