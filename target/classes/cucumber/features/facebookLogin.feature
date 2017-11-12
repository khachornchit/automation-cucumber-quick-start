Feature: Facebook Login Tests

Scenario: Login Facebook Successfully 
	Given Browse facebook website successfully 
	When Input email address correctly 
	And Input password correctly 
	And Click on login button 
	Then Able to login facebook and see account name label 
	And Close facebook website 