Feature: Datatable testing implementation

@Datatable
Scenario: Implementing Datatable
Given User is on Registration page
When User pass the following user details
		 |FirstName|LastName|PhoneNo|DOB|Gender|
		 |Sumit		|	Kumar| 99999|1993|M|
		 |Amit	| Kumar|8888|1991|M|
			
Then Registration successful