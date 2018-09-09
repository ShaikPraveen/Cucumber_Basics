Feature: Free CRM Application Testing
Scenario: Verify Contact Page
          Given user is on Home page
          When  user enters contact details form 
          Then  contact created
          
          
Scenario: Verify Deals Page
          Given user is on Home page
          When  user enters deals  details form 
          Then  new deal created
          
Scenario Outline: Verify Email Page
          Given user is on Email page
          When  user fills  Email form 
          Then  new Email created
          
Examples:
       
       | mali1 |
       | mail2 |
       | mail3 |
        
  
          
          
          
          
          
          
