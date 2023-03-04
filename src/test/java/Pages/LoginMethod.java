package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMethod 
{
	WebDriver driver = null;
	
	@FindBy(xpath="https://accounts.magicbricks.com/userauth/login")
	WebElement loginpage;
	
	@FindBy(xpath="//input[@id='emailOrMobile']")
	WebElement email;
	
	@FindBy(xpath="//button[@id='btnStep1']")
	WebElement nextbtn;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"emailIdVerificationLinkDiv\"]/div[2]/button")
	WebElement continuebtn;
	
	public LoginMethod(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//public void loginpage()
	//{
		//loginpage.click();
	//}
	
	public void email()
	{
		email.sendKeys("venkateswarinandyala@gmail.com");
	}
	
	public void nextbtn()
	{
		nextbtn.click();
	}
	
	public void pwd()
	{
		pwd.sendKeys("Venky$27");
	}
		
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
	public void continuebtn()
	{
		continuebtn.click();
	}
	

	
	


	
	

	
	

	
	

}
