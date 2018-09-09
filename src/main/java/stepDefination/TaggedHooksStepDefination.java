package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TaggedHooksStepDefination 
{
	//Global Hooks -- Applicable for all three scenarios
	@Before(order=0)
	public void setUp()
	{
		System.out.println("Launch the Browser");
		System.out.println("Enter URL");
	}
	
	//Global Hooks -- Applicable for all three scenarios
	@After(order=0)
	public void tearDown()
	{
		System.out.println("Close Browser");
	}
	
	
	@Before(order=1)
	public void setUp1()
	{
		System.out.println("Launch the Browser");
		System.out.println("Enter URL");
	}
	
	@After(order=1)
	public void tearDown1()
	{
		System.out.println("Close Browser");
	}
	

	//Local ---Only for First Scenario
	@Before(" @First")
	public void beforeFirst()
	{
		System.out.println(" Before only First Scenario");
	}
	
	@After(" @First")
	public void afterFirst()
	{
		System.out.println(" After  only First Scenario");
	}

	@Before("@Second")
	public void beforeSecond()
	{
		System.out.println(" Before only Second Scenario");
	}
	
	@After("@Second")
	public void afterSecond()
	{
		System.out.println(" After  only Second Scenario");
	}

	@Before("@Third")
	public void beforeThird()
	{
		System.out.println(" Before only Third Scenario");
	}
	
	@After("@Third")
	public void afterThird()
	{
		System.out.println(" After  only Third Scenario");
	}
	
	
	@Given("^This is First Step$")
	public void this_is_First_Step() throws Throwable
	{
		System.out.println(" This is First Step");
	    
	}

	@Then("^This is Second Step$")
	public void this_is_Second_Step() throws Throwable 
	{
		System.out.println(" This is Second Step");
	    
	}

	@Then("^This is Third Step$")
	public void this_is_Third_Step() throws Throwable
	{
   
		System.out.println(" This is Third Step");
	}
}
