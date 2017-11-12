Feature: Facebook User Navigation Sub Items Tests 
	
Scenario: Logout Facebook Successfully 
	Given Browse facebook website successfully
	And Login to facebook successfully
	And Able to click on user navigation menu
	When The user navigation menu is displayed
	Then Able to moving mouse to each sub menu items one by one
	And Able to click on Logout item
	And Able to redirect page to login page after logout successful
	And Able to close facebook website finally