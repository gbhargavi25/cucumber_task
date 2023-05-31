Feature: Login and search functionality

Scenario Outline: Login with valid credentials
Given User navigates to login page
When User enters valid email address "<username>" into email field
And User enters valid password "<password>" into password field
And User clicks on Login button 
Then User should get successfully logged in
When User enters valid product "HP" into Search box field
And User clicks on Search button
Then User should get valid product displayed in search results
Then User should close the browser
Examples:

|username|password|
|gbhargavi25@gmail.com|satyadurga|
|gbhargavi25@gmail.com|satyadurga|





