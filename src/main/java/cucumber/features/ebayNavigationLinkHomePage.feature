Feature: ebay Navigation Link of Home Page 

Scenario Outline: Test page title after clicking each navigation link of ebay home page 
#	Given I browse ebay website till page load finish
	When I click on navigation link name <navigationName>
#	Then It will navigate to correct page tile 
#	And I close the ebay website 
#	
#	Examples: 
#		| navigationName |
#		| Following |
#		| Fashion |
#		| Electroinics |