Feature: Test Gift Card functionalities working properly

  Scenario: Check GiftCard page  is popup after click on gift card

    Given a user is on the home page
    When click on LOGIN button
    When user enters emailAddress "kamaluctg@gmail.com" and password "Abcd1981"
    And click on LOG IN button
    When click on Gift Cards
    Then user is on the Gift Card Homepage