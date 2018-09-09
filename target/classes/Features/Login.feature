Feature: Free CRM Login Feature

  #Data Driven Testing uing without Examples Keyword
  #Scenario: Free CRM Login Test Scenario
  #Given User is already on Login page
  #When Title of the login page is Fee CRM
  #Then User enters "gopikamma" and "gopikamma"
  #Then User clicks Login button
  #Then User is on Home Page
  # Then User close the browser
  #Data Driven Testing uing without Examples Keyword
  
  Scenario Outline: Free CRM Login Test Scenario
    Given User is already on Login page
    When Title of the login page is Fee CRM
    Then User enters "<username>" and "<password>"
    Then User clicks Login button
    Then User is on Home Page
    Then User close the browser
    
Examples:
    
      | username    | password     |
      | gopikamma   | gopikamma    |
      | praveen     | praveen@1120 |
      | shaik       | shaik@1120   |
      | Praveen1177 | praveen@1120 |
