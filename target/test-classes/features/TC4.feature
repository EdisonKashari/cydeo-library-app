Feature: Login as librarian
  User Story:  Login as librarian and
  verify the number
@library
Scenario: Login as librarian same line
Given I am on the login page
When I login using "librarian1@library" and "qU9mrvur"

Then dashboard should be displayed
And there should be "140" users
 #number can be whatever you have there