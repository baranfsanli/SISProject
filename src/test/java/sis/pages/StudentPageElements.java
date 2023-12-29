package sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class StudentPageElements extends CommonMethods{
	

	@FindBy (xpath ="//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[1]//table//td")
	public List<WebElement> listofStudentTabItems;
	
	
	
	
	public StudentPageElements() {
		
		
		PageFactory.initElements(driver, this);
	}

}
