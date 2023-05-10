Feature:To validate the  login functionality of facebook application
Scenario:`To validate login with valid username and invalid password
Given To launch the chromebrowser and maximise window
When To launch the url of the facebook application
And To pass valid username in email field
And To pass valid password in password field
And To click the login button
And To check whether navigate to the home page or not
Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality
Given user has to launch the browser and maximise the window 
When User has to hit the facebook url
And User has to pass the data "< emaildatas>"in email field
And User has to pass the data in "<passworddatas >"password field
And user has to click login button 
Then User has to close the browser

Examples:
|  emaildatas                 | passworddatas |
|  rhamlakshmanan@gmail.com   | 12345@abcd    |
|  manikumae@gmail.com        | abcd@12345    |
|  ramseh@gmail.com           | qwertyui      |
|  ravikumar123@gmail.com     | passworddata  |
