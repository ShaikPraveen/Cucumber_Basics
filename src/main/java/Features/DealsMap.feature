Feature: Create New Deals Page

  Scenario: Verify New Deals Page
    Given User is already on Login page
    When Title of the login page is Fee CRM
    Then User enters username and password
      | username    | password     |
      | Praveen1177 | praveen@1120 |
    Then User clicks Login button
    Then User is on Home Page
    Then User moves to New deals Page
    Then User enters new deals details
      | title  | amount | probability | commission |
      | Teting |    500 |          50 |         25 |
      | Teting |    600 |          60 |         35 |
      | Teting |    700 |          70 |         45 |
    Then User close the browser
