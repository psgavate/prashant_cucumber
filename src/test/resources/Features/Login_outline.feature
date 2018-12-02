@maintest
Feature: login feature 
@test1
Scenario Outline: login with username and password 
	Given User enters Username "<UserName>" and User enters Password "<Password>" 
	And User clicks on Login button 
	Then User is successfully logged in 
	
	Examples: 
		| UserName      | Password       |
		| test_username | test_Password  |
		| test_username1 | test_Password2  |
		
@test2 @test1
Scenario Outline: login with username and password 
	Given User enters Username "<UserName>" and User enters Password "<Password>" 
	And User clicks on Login button 
	Then User is successfully logged in 
	
	Examples: 
		| UserName      | Password       |
		| test_username | test_Password  |
		| test_username1 | test_Password2  |