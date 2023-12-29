package sis.steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class StudentPageValidationSteps extends CommonMethods{
	
	@When("I successsfuly login with valid credentials")
	public void i_successsfuly_login_with_valid_credentials() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginButton);

		waitForVisibility(homepage.testAcademyTxt);
	}
	
	@When("I click students tab")
	public void i_click_students_tab() {
		click(homepage.studentTab);    
	}
	
	@Then("I Validate all the tabs are visible")
	public void i_validate_all_the_tabs_are_visible(io.cucumber.datatable.DataTable dataTable) {
	    
	 
		
		List<String> listOfTabsExpected = dataTable.asList();
		
		List<String> listOfTabsActual = new ArrayList<>();
		
		//*[@id="form1"]/table[3]/tbody/tr/td[3]/table[1]/tbody/tr[1]/td/table/tbody//td[2]
		
		
		for(int i=2; i<43;i=i+4) {
			
			String tab = driver.findElement(By.xpath("//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[1]/tbody/tr[1]/td/table/tbody//td["+i+"]")).getText().trim();
			
			listOfTabsActual.add(tab);
			
		}
		
		
		Assert.assertEquals(listOfTabsExpected, listOfTabsActual);
	    
	   
	}


}
