Feature: Create New Deals Page

  Scenario: Verify New Deals Page
    Given User is already on Login page
    When Title of the login page is Fee CRM
    Then User enters username and password
      | Praveen1177 | praveen@1120 |
    Then User clicks Login button
    Then User is on Home Page
    Then User moves to New deals Page
    Then User enters new deals details
      | Teting | 500 | 50 | 25 |
    Then User close the browser
