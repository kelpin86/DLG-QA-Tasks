@login
Feature: Login

  Background:
    Given user is on login page

  Scenario:Verify that a user will be able to login with a valid username and valid password.
    When user enters valid username
    Then user enters valid password
    And user clicks login button
    Then verify that 'Successfully logged in!' message is displayed

  Scenario: Verify that login button is disabled with invalid username
    When user enters invalid username
    Then user enters valid password
    And verify that login button is disabled

  Scenario: Verify that login button is disabled with invalid password
    When user enters valid username
    Then user enters invalid password
    And verify that login button is disabled

  Scenario Outline: Verify that username should consist regular email address naming convention
    When user enters following "<username>"
    Then verify that error message is displayed
    And verify that login button is disabled

    Examples:
      | username                           |
      | Abc.example.com                    |
      | A@b@c@example.com                  |
      | ab(c)d,e:f;g<h>i[j\k]l@example.com |
      | a@b.c                              |
      | abcdef                             |
  @wip
  Scenario Outline: Verify that password length should be between 8 to 16 digits
    Given user enters valid username
    When user enters following <password>
    Then verify that error message is displayed
    And verify that login button is disabled

    Examples:
      | password          |
      | 1                 |
      | 1234567           |
      | 12345678901234567 |
