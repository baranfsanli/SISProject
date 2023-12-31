package sis.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;

public class ValidateEnrollStudentSteps extends CommonMethods{
	
	@When("I click student tab and pick status as new and select {string} in students")
	public void i_click_student_tab_and_pick_status_as_new_and_select_in_students(String studentName) {
		click(homepage.studentTab);
		selectDropdown(studentpage.studentStatusList, 1);
		selectDropdown(studentpage.studentsDD, studentName);

		
	}
	@When("I click enroll and pick grade and click enroll")
	public void i_click_enroll_and_pick_grade_and_click_enroll() {
	    click(studentpage.enrollButton);
	    selectDropdown(studentpage.gradeSelectionDDEnrollPopUp, "11th Grade");
	    click(studentpage.enrollPopUpButton);
	    
	    
	}
	@Then("I validate that {string} text is there")
	public void i_validate_that_text_is_there(String expected) {
		
		String actual = studentpage.statusCheckEnrolled.getText();
		
		Assert.assertEquals(actual, expected);
		
	    
	}
	@Then("I click enrollment tab check if {string} is there")
	public void i_click_enrollment_tab_check_if_is_there(String string) {
	   
	}

}
