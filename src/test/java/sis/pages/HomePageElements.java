package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class HomePageElements extends CommonMethods{
	
	@FindBy (id = "Header1_lblSchoolName")
	public WebElement  testAcademyTxt;
	
	
	@FindBy(xpath = "//*[@id=\"form1\"]/table[2]/tbody/tr[2]/td")
	public WebElement welcomeAdminTxt;
	
	public HomePageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
