Feature: DynamicLoading Functionality

  Background:
    Given User navigate to Dynamic Loading page

  Scenario:Verify that page retrieve Hello World text when we click on the dynamic loading first element
    And User navigate to Dynamic Loading Element One page
    When User clicks on the start button
    And User waits for the element
    Then Hello World text should be displayed

  Scenario:Verify that page retrieve Hello World text when we click on the dynamic loading second element
    And User navigate to Dynamic Loading Element Two page
    When User clicks on the start button
    And User waits for the element
    Then Hello World text should be displayed