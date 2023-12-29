#Author: Baran Sanli

@studentsPage
Feature: Students Page Validation


  @dataTable
  Scenario: Please validate all sub tabs are visible
    
    When I successsfuly login with valid credentials
    And I click students tab
    Then I Validate all the tabs are visible
  
			|	Personal 							|
			|	Parental							|
			|	Academic							|
			|	Override Final Grade  |
			|	Schedule							|
			|	Discipline Stats			|
			|	Personal 2						|
			|	Enrollment						|
			|	Notes									|
			|	E-Portfolio						|
			|	Program Enrollment		|
			