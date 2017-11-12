Feature: Facebook Logout Tests 
	
Scenario: Logout Facebook Successfully 
	Given Browse facebook website successfully
	When Login to facebook successfully
	Then Able to click on user navigation menu
	And Able to moving mouse to sub menu item Logout
	And Able to click on Logout item
	And Able to redirect page to login page after logout successful
	And Able to close facebook website finally