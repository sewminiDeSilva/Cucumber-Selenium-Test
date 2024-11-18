Feature: Login Functionality

 Scenario: check user login is successful with valid credentials
 Given the user is on the login page
 When User enter valid Username and Password
 And click on Login Button
 Then the user should see dashboard
 And close the browser