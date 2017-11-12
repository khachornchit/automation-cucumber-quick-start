Feature: Facebook Signup Form 

Scenario: I would like to fill all fields in signup form 
	Given Browse facebook website successfully 
	When I key data into each field 
		|Fields|Value|
		|First Name|Blewitt|
		|Last Name|Afton|
		|Email Address|afton.blewitt@ghanamail.com|
		|Password|1234|
		|Birth Day|10|
		|Birth Month|4|
		|Birth Year|2011|
	Then Able to close facebook website finally