package com.demo.Sprint2;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  @CucumberOptions(features="src\\test\\resources\\HomeLoans.feature")
public class HomeLoansRunner {

}
