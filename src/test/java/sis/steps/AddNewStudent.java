package sis.steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class AddNewStudent extends CommonMethods{
	
	
	@When("I login with valid credentials and navigate to SIS homepage")
	public void i_login_with_valid_credentials_and_navigate_to_sis_homepage() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginButton);

		waitForVisibility(homepage.testAcademyTxt);
	
	}
	
	@When("I click student tab and click on add new button")
	public void i_click_student_tab_and_click_on_add_new_button() {
		
		click(homepage.studentTab);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(studentpage.addNewStudentButton));
		
	
		jsClick(studentpage.addNewStudentButton);
	
	}
	
	@When("I add Necessary inoformation")
	public void i_add_necessary_inoformation() {
	    
		sendText(studentpage.stateId, "112233");
		sendText(studentpage.lastName, "Sharp");
		sendText(studentpage.firstName, "Aytekin");
		sendText(studentpage.middleName, "B");
		sendText(studentpage.SSN, "111223334");
		sendText(studentpage.eMail, "aytek@gmail.com");
		sendText(studentpage.dateOfBirth, "01/01/2009");
		selectDropdown(studentpage.genderDD, "Male");
		selectDropdown(studentpage.lunchDD, 1);
		selectDropdown(studentpage.raceDD, 4);
		sendText(studentpage.password, "keskin@1234");
		selectDropdown(studentpage.gradeLevel, 12);
		click(studentpage.submitButton);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());
	
	}
	
	
	
	@Then("I Validate success message displayed indicating student is created.check more outcomes")
	public void i_validate_success_message_displayed_indicating_student_is_created_check_more_outcomes() throws InterruptedException {
	    
	String expected = "Successfully Added";
	
	String actual = getAlertText().trim();
	System.out.println(expected.equals(actual));
	Assert.assertEquals(expected, actual);
	
	Thread.sleep(4);
	
	acceptAlert();
	
	String username = studentpage.userName.getAttribute("value");
	
	System.out.println("Username: "+ username);
	click(studentpage.passwordArrow);
	
	String password = studentpage.password.getAttribute("value");

	System.out.println("Password: "+ password);

	}
	
	
	

}
