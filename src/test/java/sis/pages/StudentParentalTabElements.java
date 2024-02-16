package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class StudentParentalTabElements extends CommonMethods {
	
	@FindBy (id="bAddNew")
	public WebElement primaryParentAddNewButton;
	
	
	
	
	
	public StudentParentalTabElements() {
		
		PageFactory.initElements(driver, this);
	}
	

}
