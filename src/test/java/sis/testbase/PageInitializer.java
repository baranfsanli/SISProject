package sis.testbase;

import sis.pages.HomePageElements;
import sis.pages.LoginPageElements;
import sis.pages.StudentPageElements;
import sis.pages.StudentParentalTabElements;

public class PageInitializer extends BaseClass {

	
	public static LoginPageElements login;
	public static HomePageElements homepage;
	public static StudentPageElements studentpage;
	
	public static StudentParentalTabElements parental;
	
	public static void initialize() {
		
	login = new LoginPageElements();
	homepage = new HomePageElements();
	studentpage =  new StudentPageElements();
	parental = new StudentParentalTabElements();
	
	}

	

}
