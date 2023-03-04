package Pages;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void Test() throws InterruptedException 
  {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  //driver.get("https://magicbricks.com/");
	  //Thread.sleep(2000);
	  //driver.manage().window().maximize();
	  driver.get("https://accounts.magicbricks.com/userauth/login");		
      driver.manage().window().maximize();
      LoginMethod lg = new LoginMethod(driver);
      lg.email();
      lg.nextbtn();
      lg.pwd();
      lg.loginbtn();
      lg.continuebtn();
   }
}
