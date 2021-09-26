Feature: Test after successful login Publix Logo exits

  Scenario: Check Publix logo exits after login user account

    Given a user is on the home page
    When click on LOGIN button
    When user enters emailAddress "kamaluctg@gmail.com" and password "Abcd1981"
    And click on LOG IN button
    Then user is on the publix logo