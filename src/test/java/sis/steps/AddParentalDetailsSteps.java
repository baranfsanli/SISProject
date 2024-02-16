package sis.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import sis.utils.CommonMethods;
import sis.utils.ConfigsReader;

public class AddParentalDetailsSteps extends CommonMethods {

	@When("I click studen tab and search {string} in the search box and hit enter")
	public void i_click_studen_tab_and_search_in_the_search_box_and_hit_enter(String string) {

		click(homepage.studentTab);
		selectDropdown(studentpage.studentsDD, string);

	}

	@When("I check first name is {string}")
	public void i_check_first_name_is(String fNameExpected) {

		String fNameActual = studentpage.firstName.getAttribute("value");
		System.out.println(fNameActual);
		
		Assert.assertEquals(fNameExpected, fNameActual);

	}

	@When("I click Parental tab and I click Add New button near Primary Parent")
	public void i_click_parental_tab_and_i_click_add_new_button_near_primary_parent() {

		click(studentpage.parentalTabButton);
		click(parental.primaryParentAddNewButton);
		
	}

	@When("I fill necessary fields such as name lastname relation adress city state cell phone and email and click save")
	public void i_fill_necessary_fields_such_as_name_lastname_relation_adress_city_state_cell_phone_and_email_and_click_save() {

	}

	@Then("I validate if username is created and check password by hovering the mouse on the arrow by username")
	public void i_validate_if_username_is_created_and_check_password_by_hovering_the_mouse_on_the_arrow_by_username() {

	}

	@Then("I validate the first name")
	public void i_validate_the_first_name() {

	}

}
