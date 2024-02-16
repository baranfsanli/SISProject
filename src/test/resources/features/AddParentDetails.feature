#Author: Baran Sanli

@addParentDetails
Feature: Add Parent Details Feature
 

  
  Scenario: Add Parent Details scenario
   
   
    When I login with valid credentials and navigate to SIS homepage
    And I click studen tab and search "Sharp Aytekin" in the search box and hit enter
    And I check first name is "Aytekin"
    And I click Parental tab and I click Add New button near Primary Parent
    And I fill necessary fields such as name lastname relation adress city state cell phone and email and click save
    Then I validate if username is created and check password by hovering the mouse on the arrow by username
    And I validate the first name


