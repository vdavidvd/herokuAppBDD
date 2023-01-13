Feature: DragAndDrop Functionality

  Scenario: Verify that heading of box A is transferred to box B after action drag and drop
    Given User navigate to DragAndDrop page
    And Heading of box A is "A"
    And Heading of box B is "B"
    When User drag box A and drop on box B
    Then Heading of box A should be "B"
    And Heading of box B should be "A"