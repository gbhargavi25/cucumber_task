Feature: Search functionality
@validProduct
Scenario: User searches for a valid product
Given User opens the Application
When User enters valid product "HP" into Search box field
And User clicks on Search button
Then User should get valid product displayed in search results
@invaliProduct
Scenario: User searches for an invalid product
Given User opens the Application
When User enters invalid product "Honda" into Search box field
And User clicks on Search button
Then User should get a message about no product matching
@withoutAnyProduct
Scenario: User searches without any product
Given User opens the Application
When User dont enter any product name into Search box field
And User clicks on Search button
Then User should get a message about no product matching
Then User should close the application