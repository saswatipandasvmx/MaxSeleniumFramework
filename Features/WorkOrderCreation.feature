@SmaxRegression 
Feature: WorkOrder Creation

 


  Scenario: To book an appointment in the booking window
     Given the user  is on the  portal
     Then the user loggs in with the credentials as username"saswati.p@servicemax.com.optxpart1" and password"servicemax1"
     Then validate the user has logged in the protal
     Then click on the WorkOrders Tab
     Then Select the Regression View
     Then Open the first workobject on the view
     Then clone the workobject
     Then the user clicks on the Get_Appointment_ECO
     Then the user books a slot
  
