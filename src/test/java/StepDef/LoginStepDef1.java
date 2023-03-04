package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class LoginStepDef1 
{
	WebDriver driver;
	WebElement email;
	WebElement nextbtn;
	WebElement pwd;
	WebElement loginbtn;
	WebElement continuebtn;
	
	@Given("Browser is open")
	public void browser_is_open()
	{
		System.setProperty("Webdriver.chrome.driver","‪C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
	}

	@And("User is on Login Page")
	public void user_is_on_login_page() 
	{
	  driver.get("https://accounts.magicbricks.com/userauth/login");	
	}
	
	@When("User enters a valid email")
	public void user_enters_a_valid_email() throws InterruptedException 
	{
		driver.findElement(By.id("emailOrMobile")).sendKeys("venkateswarinandyala@gmail.com");
		Thread.sleep(1000);
	}
	
	@And("User clicks on Next Button")
	public void user_clicks_on_next_button() 
	{
		driver.findElement(By.id("btnStep1")).click();
	}
	
	@And("User enters the password")
	public void user_enters_the_password() throws InterruptedException 
	{
		driver.findElement(By.id("password")).sendKeys("Venky$27");
		Thread.sleep(1000);
	}
	
	@And("User clicks on Login Button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@And("User clicks on Continue Button")
	public void user_clicks_on_continue_button() 
	{
		WebElement e = driver.findElement(By.xpath("//*[text()='Continue']"));
		System.out.println(e.getText());
		e.click();
    }
	
	@Then("User Login and navigate to the HomePage")
	public void user_login_and_navigate_to_the_home_page() 
	{
		boolean displayed = driver.findElement(By.id("home_page_msg")).isDisplayed();
		Assert.assertTrue(displayed);		
	}
	
	@When("User enters a invalid email")
	public void user_enters_a_invalid_email() throws InterruptedException
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("emailOrMobile")).sendKeys("@123@gmail.com");
		Thread.sleep(1000);
	}
	@When("User enters a invalid MobileNumber")
	public void user_enters_a_invalid_mobile_number() throws InterruptedException 
	{
		driver.findElement(By.id("emailOrMobile")).sendKeys("2223334440");
		Thread.sleep(1000);
	}

	@And("User should see an error message")
	public void user_should_see_an_error_message() 
	{
		driver.findElement(By.id("step1Error")).isDisplayed();
	}

	@Then("User shouldnot be redirected to the MagicBricks HomePage")
	public void user_shouldnot_be_redirected_to_the_magic_bricks_home_page() 
	{
		boolean displayed = driver.findElement(By.id("btnLogin")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	@Then("User should not be redirected to the MagicBricks HomePage")
	public void user_should_not_be_redirected_to_the_magic_bricks_home_page() 
	{
	    boolean displayed = driver.findElement(By.id("btnStep1")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	@When("User enters (.*) as email")
	public void user_enters_gmail_com_as_email(String email) throws InterruptedException 
	{
		driver.findElement(By.id("emailOrMobile")).sendKeys(email);	
		Thread.sleep(1000);
	    
	}
	@When("User enters (.*) as password")
	public void user_enters_as_password(String password) throws InterruptedException 
	{
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
	    
	}
	@When("User enters venkateswarinandyala@gmail.com as email")
	public void user_enters_venkateswarinandyala_gmail_com_as_email() throws InterruptedException {
	   
		driver.findElement(By.id("emailOrMobile")).sendKeys("venkateswarinandyala@gmail.com");
		Thread.sleep(1000);
	}	

	@When("User enters abcdef as password")
	public void user_enters_abcdef_as_password() throws InterruptedException {
	   
		driver.findElement(By.id("password")).sendKeys("abcdef");
		Thread.sleep(1000);
	}	

	@When("User enters 123456 as password")
	public void user_enters_123456_as_password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);
	}
	
	


}
