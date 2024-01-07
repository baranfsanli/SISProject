package sis.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import sis.utils.CommonMethods;
import sis.utils.DBUtils;

public class ValidateStudentTableSteps extends CommonMethods{
	
	
	
	List<Map<String,String>> studentList;
	String fullNameActual;
	
	@Given("I connect to Database")
	public void i_connect_to_database() {
		
		DBUtils.getConnection();
		System.out.println("Connection is succesful!");
		  
	}
	@When("I filter the student with first and last name")
	public void i_filter_the_student_with_first_and_last_name() {
		String query = "SELECT FirstName,LastName FROM STUDENT WHERE LastName ='sanli'";
		
		studentList = DBUtils.storeDataFromDB(query);
		System.out.println(studentList);

	    
	}
	@Then("I print the name and validate if it is matching with the student added")
	public void i_print_the_name_and_validate_if_it_is_matching_with_the_student_added() {
	    
		
		for(Map<String,String> i :studentList ) {
			
			fullNameActual = i.get("FirstName") +" "+ i.get("LastName");
			
		}
		
		String fullNameExpected = "brian sanli";
		
		Assert.assertEquals(fullNameExpected, fullNameActual);
		
		
		
		
	}
	@Then("I close the Database")
	public void i_close_the_database() {
	    DBUtils.closeConnection();
	}

}
