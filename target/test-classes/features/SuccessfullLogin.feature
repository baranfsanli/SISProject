#Author: Baran Sanli

@login
Feature: Successful login and homepage validation
 

  @validlogin
  Scenario: Log in with valid credentials
    When I enter valid username and password
    Then I validate the "TEST ACADEMY" text is there
    
  @invalidlogin
  Scenario: Log in with invalid credentials
    When I enter valid username and invalid password
    Then I validate that the alert pops up print the text
    
  @emptycredentials
  Scenario: Log in with empty credentials
    When I enter valid username and empty password
    Then I validate that the alert for empty credentials pops up print the text


