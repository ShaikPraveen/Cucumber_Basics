/*package stepDefination;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination 
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
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_Username_and_Password(String username, String password) 
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
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
	
	
	@Then("^User close the browser$")
	public void User_close_the_browser()
	{
		driver.close();	
	}
	
	
}
*/