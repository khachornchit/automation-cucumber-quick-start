Feature: Amazon Navigation Link of Home Page

Scenario: Check page title when click main menu Your Amazon Page 
	Given I open browser with amazon website 
	And I must load page with correctly page title 
	And I must find main menu name "Your Amazon.com" 
	When I click on main menu "Your Amazon.com" 
	Then It will navigate to "Your Amazon.com" page and check page title correctly 
	And I close the browser 
	
#Scenario: Check page title when click main menu Today's Deals Page 
#	Given I open browser with amazon website 
#	And I must load page with correctly page title 
#	And I must find main menu name "Today's Deals" 
#	When I click on main menu "Today's Deals" 
#	Then It will navigate to "Today's Deals" page and check page title correctly 
#	And I close the browser 
#	
#Scenario: Check page title when click main menu Gift Cards & Registry 
#	Given I open browser with amazon website 
#	And I must load page with correctly page title 
#	And I must find main menu name "Gift Cards & Registry" 
#	When I click on main menu "Gift Cards & Registry" 
#	Then It will navigate to "Gift Cards & Registry" page and check page title correctly 
#	And I close the browser 
#	
#Scenario: Check page title when click main menu Sell 
#	Given I open browser with amazon website 
#	And I must load page with correctly page title 
#	And I must find main menu name "Sell" 
#	When I click on main menu "Sell" 
#	Then It will navigate to "Sell" page and check page title correctly 
#	And I close the browser 
#	
#Scenario: Check page title when click main menu Help 
#	Given I open browser with amazon website 
#	And I must load page with correctly page title 
#	And I must find main menu name "Help" 
#	When I click on main menu "Help" 
#	Then It will navigate to "Help" page and check page title correctly 
#	And I close the browser 
	