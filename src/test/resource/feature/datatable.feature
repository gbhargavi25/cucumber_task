Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|bhargavi	   |guduri	|bhargavivee@gmail.com	|1234567890   |12345		|12345   |
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully
