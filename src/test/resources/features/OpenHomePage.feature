Feature: Open the-internet homepage

  Scenario: User opens the homepage
    Given the user launches the Chrome browser
    When the user navigates to the-internet homepage
    Then the homepage should be displayed
