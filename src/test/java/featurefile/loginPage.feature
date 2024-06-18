Feature: EPS Web Login Page

Scenario: User is login succssefully 
Given User is on login page
When Enter <username> and <password>
Then User can login succssefully
And Land on Dasboard Page 
 

Examples:
|username|password|
|SantoshS@npav.net|npav1|

#Scenario: Create Policy For User
#Given Click on Policy Management buttoon 
#When Enter Policy Name "DLPUser" and Description "Policy For DLP User"
#Then Admin create policy for DLPUser
#And Verify Policy is created successfully 

