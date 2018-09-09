Feature: FREE CRM Create Contact

  Scenario Outline: Free Crm Create New Contact Scenarioa
    Given User is already on Login page
    When Title of the login page is Fee CRM
    Then User enters "<username>" and "<password>"
    Then User clicks Login button
    Then User is on Home Page
    Then User moves to New Contact Page
    Then User enters contact details "<firstname>" and "<lastname>" and "<position>" and "<department>"
    Then User close the browser

    Examples: 
      | username    | password     | firstname | lastname | position | department |
      | Praveen1177 | praveen@1120 | Tom       | Shaik    | Testing  | Automation |
