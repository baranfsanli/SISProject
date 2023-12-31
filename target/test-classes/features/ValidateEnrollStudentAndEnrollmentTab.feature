#Author: Baran Sanli

@enrollStudent
Feature: Validate Enroll Student functionality and "Enrollment" Tab
  

  
  Scenario: 
    
    When I login with valid credentials and navigate to SIS homepage
    And I click student tab and pick status as new and select "sanli brian" in students
    And I click enroll and pick grade and click enroll 
    Then I validate that "Enrolled" text is there
    And I click enrollment tab check if "sanli brian" is there

 
