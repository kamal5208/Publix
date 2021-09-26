Feature: test Shop Online functionalities

  Scenario: Check user able to choose their desired gift card

    Given a user is on the home page
    When user mouse hover on Shop Online
    When user click on Publix Gift Cards
    When user click on Individual Order Type
    And user click on No Imprint Restriction Type
    When user click on Continue Order Button
    Then user is on the Publix Gift Card page