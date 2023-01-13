Feature: DropDown Functionality

  Scenario: Verify that user can select option from drop down
    Given User navigate to DropDown page
    And Please select an option is selected initial
    When User select one option from drop down
    Then That option should be selected