Feature: FormAuthentication Functionality

  Background:
    Given User navigate to Login page

  Scenario: Login with valid credentials
    When User enters valid username as "tomsmith"
    And User enters valid password as "SuperSecretPassword!"
    And User clicks on the login button
    Then User should be logged in
    And Success login message should be displayed

  Scenario: Login with valid username and invalid password
    When User enters valid username as "tomsmith"
    And User enters invalid password as "somePassword"
    And User clicks on the login button
    Then Warning message about wrong password should be displayed

  Scenario: Login with invalid username and valid password
    When User enters invalid username as "someUsername"
    And User enters valid password as "SuperSecretPassword!"
    And User clicks on the login button
    Then Warning message about wrong username should be displayed

  Scenario: Login without providing credentials
    When User don't enters any credentials
    And User clicks on the login button
    Then Warning message about wrong username should be displayed