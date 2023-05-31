Feature: Login and search functionality

Scenario: Login with valid credentials
Given Open browser and navigates to login page
When User enters email address as "gbhargavi25@gmail.com" into email field
And User enters password as "satyadurga" into password field
And Click on login button 
Then User should login successfully

