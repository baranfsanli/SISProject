package sis.testbase;

import sis.pages.HomePageElements;
import sis.pages.LoginPageElements;

public class PageInitializer extends BaseClass {

	
	public static LoginPageElements login;
	public static HomePageElements homepage;
	
	
	public static void initialize() {
		
	login = new LoginPageElements();
	homepage = new HomePageElements();
	
	
	}

	

}
