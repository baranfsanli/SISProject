package sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sis.utils.ConfigsReader;

import sis.utils.CommonMethods;

public class LoginPageElements extends CommonMethods{
	
	@FindBy(id = "tUsername")
	public WebElement username;
	
	@FindBy (id = "tPassword")
	public WebElement password;
	

	@FindBy (id = "dAcademicYear_list")
	public WebElement academicYearDDList;
	
	@FindBy(id = "bLogin")
	public WebElement loginButton;
	
	
	
	@FindBy(className = "headerMid")
	public WebElement SISLogintxt;
	
	@FindBy(id = "topLogo")
	public WebElement loginPageLogo;
	
	
	public LoginPageElements() {
		
		PageFactory.initElements( driver,this);
	
	}
	
	public void adminLogin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(loginButton);
	}
	
}
