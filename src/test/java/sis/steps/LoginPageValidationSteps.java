package sis.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;

import sis.utils.CommonMethods;

public class LoginPageValidationSteps extends CommonMethods{
	
	
	
	
	@Then("I validate {string} text is there")
	public void i_validate_text_is_there(String sisactualtxt) {
		
		String sisexpectedtxt = login.SISLogintxt.getText();
		
		Assert.assertEquals(sisexpectedtxt, sisactualtxt);
	    
	}	

}
