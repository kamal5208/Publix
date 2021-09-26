Feature: Test Search Box functionalities

  Scenario: Check user is able find their desire product by entering information on Search Box

    Given a user is on the home page
    When user click on Careers
    And user click on INFORMATION TECHNOLOGY
    When user click on Current Openings
    When user click on information technology
    When click on SQA test analyst
    Then user is on the test analyst career page
