package demo.web.test.fr.ie;



import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.web.test.fr.*;
import demo.web.test.fr.component.*;



public class TestStepsIE extends BaseTestSteps{
	
	
	
	@Before
    public void setUp(){
		System.out.println("THIS IS IE");
		this.appTestManager = new AppTestManager();
		this.appTestManager.setBrowser("ie");
	}
	
	
	
	
	@After
    public void cleanUp(){
    	this.base_cleanUp();
    }
    
	
	//############################## steps starts here ###############################
   
    @Given("^I am using app url to navigate to the Test page$")
    public void i_am_using_app_url_to_navigate_to_the_test_page() throws Throwable {
    	this.base_i_am_using_app_url_to_navigate_to_the_test_page();
    }

    
    @And("^I have entered (.+) into the first text box$")
    public void i_have_entered_into_the_first_text_box(String firststring) throws Throwable {
    	this.base_i_have_entered_into_the_first_text_box(firststring);
    }

    
    @And("^Then I have entered (.+) into the second text box$")
    public void then_i_have_entered_into_the_second_text_box(String secondstring) throws Throwable {
    	this.base_then_i_have_entered_into_the_second_text_box(secondstring);
    }

  
    @When("^I press concatenate button$")
    public void i_press_concatenate_button() throws Throwable {
    	this.base_i_press_concatenate_button();
    }

   
    @Then("^the result should be (.+) on the third text box$")
    public void the_result_should_be_on_the_third_text_box(String resultstring) throws Throwable {
    	this.base_the_result_should_be_on_the_third_text_box(resultstring);
    }
}