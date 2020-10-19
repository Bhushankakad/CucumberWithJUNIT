package com.zensar.CucumberBasics.Stepdefs;

import com.zensar.CucumberBasics.base.Base;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationForLoginFeature extends Base{
	


@Given("^User is on homepage$")
public void user_is_on_homepage() throws Throwable {
    
   init();
}

@When("^User enters correct credentials$")
public void user_enters_correct_credentials() throws Throwable {
    System.out.println("Hello");
}

@Then("^User should be moved to main page$")
public void user_should_be_moved_to_main_page() throws Throwable {
  System.out.println("Hi");
}

@Then("^User should be greeted with success message$")
public void user_should_be_greeted_with_success_message() throws Throwable {
	 System.out.println("Bye");
}
	

}
