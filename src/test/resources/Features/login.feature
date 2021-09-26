
Feature: Test login functionalities

@positive_test
  Scenario: Check login is successful with valid credentials
    Given a user is on the home page
    When click on LOGIN button
    When user enters emailAddress "kamaluctg@gmail.com" and password "Abcd1981"
    And click on LOG IN button
    Then user is navigated to homepage

  @DataDriven_test
  Scenario Outline: Check login is successful with valid credentials for multiple users
    Given a user is on the home page
    When click on LOGIN button
    When user enters emailAddress "<emailAddress>" and password "<password>"
    And click on LOG IN button
    Then user is navigated to homepage
    Examples:
        |emailAddress|password|
        |kamaluctg@gmail.com|Abcd1981|
        |kamalctg5208@yahoo.com|Abcd1981|
  @DataDriven_test
  Scenario: check login is successful using data table
    Given a user is on the home page
    When click on LOGIN button
    When user click on login button upon entering credentials
      |emailAddress|password|
      |kamaluctg@gmail.com   |Abcd1981  |
    Then user is navigated to homepage




