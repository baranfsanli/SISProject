package sis.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.CommonMethods;

public class StudentPageElements extends CommonMethods{
	

	@FindBy (xpath ="//*[@id=\"form1\"]/table[3]/tbody/tr/td[3]/table[1]//table//td")
	public List<WebElement> listofStudentTabItems;
	
	@FindBy (id ="bAdd")
	public WebElement addNewStudentButton;
	
	@FindBy (id="tStateId")
	public WebElement stateId;
	
	@FindBy (id="tLastName")
	public WebElement lastName;

	@FindBy (id="tFirstName")
	public WebElement firstName;
	
	@FindBy (id="tMiddleName")
	public WebElement middleName;
	
	@FindBy (id="tSSN")
	public WebElement SSN;
	
	@FindBy (id="tEmail")
	public WebElement eMail;
	
	@FindBy (id="tBirthDay")
	public WebElement dateOfBirth; // 12/27/2023 format
	
	@FindBy (id="gender_list")
	public WebElement genderDD;
	
	@FindBy (id="lunchType")
	public WebElement lunchDD;
	
	@FindBy (id="ddRaceNew")
	public WebElement raceDD;
	
	@FindBy (id="tPassword")
	public WebElement password;
	
	
	@FindBy (id="photoChange")
	public WebElement addPhotoButton;
	
	@FindBy (id="cGradeLevel_list")
	public WebElement gradeLevel;
	
	@FindBy (id="bSubmit")
	public WebElement submitButton;
	
	@FindBy (id="photoChange")
	public WebElement photoChange;
	
	
	@FindBy (id="tUsername")
	public WebElement userName;
	
	
	@FindBy (id="imgPassword")
	public WebElement passwordArrow;
	
	
	
	public StudentPageElements() {
		
		
		PageFactory.initElements(driver, this);
	}

}
