#Author: Baran Sanli

@studentTableDB
Feature: Validate Student Table (DB)
 

  
  Scenario: Connect DB and validate the student added is there 
    
    Given I connect to Database
    When I filter the student with first and last name
    Then I print the name and validate if it is matching with the student added
    And I close the Database
    

  
