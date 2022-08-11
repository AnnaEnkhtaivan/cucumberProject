Feature: USPS Look Up a ZIP Code functionality
  As a user, when I am on the usps look up a Zip Code page,
  I should be able to search by address and see relevant information

  Scenario: User search  address by street address along with city and state
    Given User is on the usps Zip Code by Address page
    When User is able to enter Street address
    And User is able to ender Apartment, suite number
    And User is able to enter City name
    And User is able to select State from dropdowns
    And User is able to click the Find button
    Then result should be displayed
