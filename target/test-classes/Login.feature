Feature: Login Functionality of MagicBricks
		I want to test the Login Functionality of MagicBricks
		
	Scenario: Successful Login with valid credentials
	  Given Browser is open
	  And User is on Login Page		
		When User enters a valid email
		And User clicks on Next Button
		And User enters the password
		And User clicks on Login Button
		And User clicks on Continue Button		
		Then User Login and navigate to the HomePage
		
	Scenario: Unsuccessful Login with invalid email
	  Given Browser is open
		And User is on Login Page
		When User enters a invalid email
		And User clicks on Next Button
		And User should see an error message
		Then User should not be redirected to the MagicBricks HomePage
		
	Scenario: Unsuccessful Login with invalid MobileNumber
	  Given Browser is open
		And User is on Login Page
		When User enters a invalid MobileNumber
		And User clicks on Next Button
		And User should see an error message
		Then User should not be redirected to the MagicBricks HomePage
		
		
	Scenario Outline: Unsuccessful Login with invalid password
		Given Browser is open
		And User is on Login Page
		When User enters <email> as email	
		And User clicks on Next Button
		When User enters <password> as password
		And User clicks on Login Button
		And User should see an error message
		Then User shouldnot be redirected to the MagicBricks HomePage
		  
    Examples:
			| email | password | status |
			| venkateswarinandyala@gmail.com | 123456 | Fail |
			| venkateswarinandyala@gmail.com | abcdef | Fail |	
			
			
	

				
		
	
			
	
	
		
		
	

 	
 
 	 