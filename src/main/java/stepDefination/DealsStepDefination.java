/*package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefination 
{
	WebDriver driver;
	@Given("^User is already on Login page$")
	public void User_is_already_on_Login_page()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	}
	
	@When("^Title of the login page is Fee CRM$")
	public void Title_of_the_login_page_is_Fee_CRM()
	{
		Assert.assertEquals(driver.getTitle(), "#1 Free CRM software in the cloud for sales and service");
		String title=driver.getTitle();
		System.out.println(title);
	  // Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title, "Title is incorrect");
	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable
	{
	     List<List<String>> usercredentials =credentials.raw();
	     driver.findElement(By.id("username")).sendKeys(usercredentials.get(0).get(0));
	     driver.findElement(By.id("password")).sendKeys(usercredentials.get(0).get(1)); 
	}
	
	
	@Then("^User clicks Login button$")
	public void user_clicks_Login_button()
	{
		WebElement btnLogin=driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", btnLogin); 
	}
	
	@Then("^User is on Home Page$")
	public void User_is_on_Home_Page()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^User moves to New deals Page$")
	public void user_moves_to_New_deals_Page() throws Throwable
	{
		 driver.switchTo().frame("mainpanel");
	      Actions action = new Actions(driver);
	      action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	      driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	   
	}

	@Then("^User enters new deals details$")
	public void user_enters_new_deals_details(DataTable dealsvalues) throws Throwable
	{
		List<List<String>> dealsdetails=dealsvalues.raw();
		driver.findElement(By.id("title")).sendKeys(dealsdetails.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealsdetails.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealsdetails.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealsdetails.get(0).get(3));   
	}
	
	@Then("^User close the browser$")
	public void User_close_the_browser()
	{
		driver.close();	
	}


}
*/