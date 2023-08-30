Feature: Hotel Booking

Scenario: login page
 Given user can able to launch the url
 When user can able to enter the username in the textbox
 And user can able to enter the password in the textbox
 Then user can able to click login button and it is navigate to nextpage
 
Scenario: Search Hotel
 When select the Location in textbox
 And  select the Hotel in textbox
 And  select the Room Type in textbox
 And  select the Number of Rooms in textbox
 And  enter the Check In Date 
 And  enter the Check Out Date
 And  select the Adult per Room in textbox
 And  select the Children per Room in textbox
 Then user can able to click Search button and it is navigate to nextpage
 

 Scenario: Select Hotel
 When user can able to click the Radio button
 Then user can able to click Continue button and it is navigate to nextpage
 
 Scenario: Book A Hotel
 When user can able to enter First name in the textbox
 And user can able to enter Last name in the textbox
 And user can able to enter Billing address in the textbox
 And user can able to enter Credit Card No in the textbox
 And user can able to select Credit Card Type in the textbox
 And user can able to select Expiry Month in the textbox
 And user can able to select Expiry Year in the textbox
 And user can able to enter CVV in the number textbox
 Then user can able to click the Book button and it is navigate to nextpage

Scenario: Booking Conformation
 Then user can able to click the My Itinerary button and it is navigate to nextpage

Scenario: Booked Itinerary
 Then user can able to click the Logout button 



 
 
  
