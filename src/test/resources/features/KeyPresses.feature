Feature: KeyPresses Functionality

  Scenario: Verify that TAB text is displayed in result when user enters TAB in input box
    Given User navigate to KeyPresses page
    When User enters "TAB" in the input box
    Then Result should contains "TAB" keyword

  Scenario: Verify that ALT text is displayed in result when user enters TAB in input box
    Given User navigate to KeyPresses page
    When User enters "ALT" in the input box
    Then Result should contains "ALT" keyword

  Scenario: Verify that D text is displayed in result when user enters TAB in input box
    Given User navigate to KeyPresses page
    When User enters "D" in the input box
    Then Result should contains "D" keyword