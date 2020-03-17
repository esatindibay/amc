Feature: AMC Theatre Login


Scenario: Home page default login
Given User is on AMC landing page
When User login into showtimes
Then Show page is executed
And Selected film is exhibited and browser closed