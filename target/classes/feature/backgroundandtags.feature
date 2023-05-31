@ALL
Feature: verifying login functionality

Background:
Given customer landed on loginpage
When customer enter username and password

@validCredentialsTest
Scenario: Verify login function with valid username and password

And click on login button
Then customer should land on homepage


@invalidCredentialsTest
Scenario: Verify login function with valid username and invalid password

Then it should get an error like invalid password

@invalidCredentialsTest
Scenario: Verify login function with Invalid username and valid password

Then it should get an error like invalid username

