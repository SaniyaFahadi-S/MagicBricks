package StepDef;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  @CucumberOptions(features="src\\test\\resources\\Login.feature",glue= {"StepDef"},monochrome = true,
		  plugin = {"pretty","html:target/HtmlReports"})
public class LoginRunner {

}
