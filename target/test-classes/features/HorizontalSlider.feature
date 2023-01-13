Feature: HorizontalSlider Functionality

  Scenario: Verify that horizontal slider functionality works properly
    Given User navigate to HorizontalSlider page
    When User move slider 9 times
    Then Slider value should be 4.5