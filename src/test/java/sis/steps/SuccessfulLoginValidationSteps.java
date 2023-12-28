package sis.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class SuccessfulLoginValidationSteps extends CommonMethods {
//    VALID CREDENTIALS
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginButton);

		waitForVisibility(homepage.testAcademyTxt);

	}

	
	@Then("I validate the {string} text is there")
	public void i_validate_the_text_is_there(String expectedTxt) {

		String actualTxt = homepage.testAcademyTxt.getText();

		Assert.assertEquals("TEST ACADEMY text has not matched", expectedTxt, actualTxt);

	}
	
//  INVALID CREDENTIALS

	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {

		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "Wrong");
		click(login.loginButton);
		

	}
	@Then("I validate that the alert pops up print the text")
	public void i_validate_that_the_alert_pops_up_print_the_text() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		String actual = getAlertText();
		String expected = "Either username and password do not match or your account doesn't have  access for the selected Academic Year.";
		Assert.assertEquals(expected, actual);
		acceptAlert();
	}

//  EMPTY CREDENTIALS	
	
	@When("I enter valid username and empty password")
	public void i_enter_valid_username_and_empty_password() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "");
		click(login.loginButton);
	    
	}
	@Then("I validate that the alert for empty credentials pops up print the text")
	public void i_validate_that_the_alert_for_empty_credentials_pops_up_print_the_text() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		String actual = getAlertText();
		String expected = "Please fill required fields";
		Assert.assertEquals(expected, actual);
		acceptAlert();
		
		
	   
	}

}
