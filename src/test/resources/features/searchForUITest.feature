Feature: Search functionality for UI tests

  @TC1UI
  Scenario: User can read the privacy policy from the search page in Turkish language
    Given User is on the homepage
    When user clicks the privacy policy link
    And user goes to the privacy policy page
    And user clicks to the Turkish language link
    Then user sees the page in Turkish

  @TC2UI
  Scenario: User can make an advantage search for .gif format
    Given User is on the homepage
    When user clicks to expand the advanced search menu
    And user scrolls down and clicks to the file type menu
    And from the dropdown menu, user clicks the .gif option
    And user scrolls up and clicks search button
    And user clicks for the first result
    Then user sees the image as .gif format

