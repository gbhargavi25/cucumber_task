
Feature: searching of various product categories should be possible 
				along with product search


  Scenario: user should be able to search under books category  
    Given I visit the website as a guest user  
		When I select the books option from the search dropdown
		And I click on search icon option
		Then I should see the page having  as Books is getting displayed
    
 