Feature: Register in Para bank

  
  Scenario: Successful registration with valid data
  Given User Launch Chrome browser
	When User opens URL "https://parabank.parasoft.com/parabank/register.htm" 
	And User enter personal information
	And Click on Register
	Then Page text should be "Your account was created successfully. You are now logged in." 
	When User click on Log out link 
	Then Page Title should be "ParaBank | Welcome | Online Banking" 
	And close browser