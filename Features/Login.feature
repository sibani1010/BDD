Feature: Login


Scenario: Successful Login with Valid Credentials


Given User Launch Chrome browser
When  User opens URL "http://admin-demo.ncpcommerce.com/login"
And   User enterss Email as "admin@yourstore.com" and Password as "admin"
And   Click on Login
Then  Page Title should be "Dashboard / nopCommerce adminstartion"
When  User click on Log out link
Then  Page Title should be "Your store. Login"
And   Close browser


