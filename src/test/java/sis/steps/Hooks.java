package sis.steps;

import sis.testbase.BaseClass;
import sis.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before 
	public void start() throws InterruptedException {
		
		BaseClass.setUp();
	}
	
	
	@After 
	public void end(Scenario scenario) throws InterruptedException {
		
		byte[] picture;
		
		if(scenario.isFailed()) {
			//store the ss in the failed folder	
			picture = CommonMethods.takeScreenshot("failed/"+scenario.getName());
		}else {
			//store the ss in the passed folder
			picture = CommonMethods.takeScreenshot("passed/"+scenario.getName());
		}
		
		scenario.attach(picture, "image/png", scenario.getName());
		
		BaseClass.tearDown();
	}	

}
