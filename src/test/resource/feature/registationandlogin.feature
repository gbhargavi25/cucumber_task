Feature: Registration,login,search functionality

@Registration

Scenario Outline: User creates an account only with mandatory fields
Given User navigates to login page
Given User clicks on registration option
When User enters "<First Name>","<Last Name>","<E-Mail>","<Telephone>","<password>","<Password Confirm>" in registration details 
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

Examples:
|First Name|Last Name|E-Mail|Telephone|password|Password Confirm|
|Bhargavi|Veeravalli|veebhargavi@gmail.com|1234567890|satyadurga|satyadurga|

@Login

Scenario: Login with valid credentials
Given User is in login page
When User enters valid email address as "veebhargavi@gmail.com" into email field
And User enters valid password as "satyadurga" into password field
And User clicks on Login button 

#@Search
#
#Scenario:
#Given User is on login page
#When User enters valid product "HP" into Search box field
#And User clicks on Search button
#Then User should get valid product displayed in search results
#Then User should close the browser
