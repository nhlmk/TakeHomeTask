Feature: Search input tests for exploratory testing.

  @TC1Exp
  Scenario: User can search with using main search box, from the given list called colors.in, and able to see correct title and secure URL
    Given User is on the homepage
    When user enters the colors in the main search box, user see correct title and secure URL

  @TC2Exp
  Scenario: User can search with search box on the top right corner, from the given list called colors.in, and able to see correct title and secure URL
    Given User is on the homepage
    When user enters the colors in the search box on the top right corner, user see correct title and secure URL






