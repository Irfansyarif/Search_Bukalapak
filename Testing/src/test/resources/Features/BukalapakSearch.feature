Feature: feature to test bukalapak search functionality

  Scenario: Validate bukalapak search working
    Given Browser is open
    And user is on bukalapak search page
    When user enter a text in search box
    And hits enter
    Then user is navigated to search results
