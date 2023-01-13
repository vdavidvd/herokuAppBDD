Feature: Hovers Functionality

  Background:
    Given User navigate to Hovers page

  Scenario: Verify that user name 1 is displayed when user hovers over it
    When User hover over image
    Then User name "name: user1" should be displayed

  Scenario: Verify that user name 2 is displayed when user hovers over it
    When User hover over image
    Then User name "name: user2" should be displayed

  Scenario: Verify that user name 3 is displayed when user hovers over it
    When User hover over image
    Then User name "name: user3" should be displayed