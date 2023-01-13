Feature: Context Menu Functionality

  Scenario: Verify that context menu action triggers JavaScript alert
    Given User navigate to ContextMenu Page
    When User right clicks on the box
    Then JavaScript alert should be displayed
    And Text from alert should be displayed says that user selected context menu