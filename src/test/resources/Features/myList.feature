Feature: Test user able to find My List

  Scenario: Check users can see the My List

    Given a user is on the home page
    When user click on Shopping List
    Then users is on the My List Page
