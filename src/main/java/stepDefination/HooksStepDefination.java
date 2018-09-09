/*package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefination
{
	@Before
	public void setUp()
	{
		System.out.println("Launch The Browser");
		System.out.println("Enter url ");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Close  The Browser");
	}
	
	
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable
	{
	   System.out.println("User is on Home Page");
	}

	@When("^user enters contact details form$")
	public void user_enters_contact_details_form() throws Throwable 
	{
		System.out.println("User Enters the details about Contact");
	    
	}

	@Then("^contact created$")
	public void contact_created() throws Throwable 
	{
		System.out.println("New Contact is Created");
	    
	}
	
	@When("^user enters deals  details form$")
	public void user_enters_deals_details_form() throws Throwable 
	{
	 
		   System.out.println(" user enters deals form");
	}

	@Then("^new deal created$")
	public void new_deal_created() throws Throwable
	{
		System.out.println("New Deal Created");
	   
	}
	
	@Given("^user is on Email page$")
	public void user_is_on_Email_page() throws Throwable 
	{
	   System.out.println("User is on Emails Page");
	}

	@When("^user fills  Email form$")
	public void user_fills_Email_form() throws Throwable 
	{
		
	  System.out.println(" use fills emails form");
	}

	@Then("^new Email created$")
	public void new_Email_created() throws Throwable
	{
		System.out.println("new email created");
	 
	}

	
	
	
	
}
*/