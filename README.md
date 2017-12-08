# GitHubOAuth2Example
An example that uses Github authentication to allow/deny access to a Spring Boot application

## Setting up 

### Create a GitHub application. 

This should work for an OAuth application as well, if you create it on GitHub. 
Make sure your callback URL and your home page are the same, and both direct to a route in your application that you can use to re-direct your authorised requests. 
I never got the callback url feature in the Application settings to work as expected - kept on getting an endless re-authorization loop. 


### Put this in your application properties file: 
There aren't enough good application.properties examples - they're mostly yaml. So here you are: 

```
security.oauth2.client.client-id=your_github_app_client_id
security.oauth2.client.client-secret=your_github_app_client_secret
security.oauth2.client.access-token-uri=https://github.com/login/oauth/access_token
security.oauth2.client.user-authorization-uri=https://github.com/login/oauth/authorize
security.oauth2.client.token-name=oauth_token
security.oauth2.client.authentication-scheme=query
security.oauth2.client.client-authentication-scheme=form
security.oauth2.resource.user-info-uri=https://api.github.com/user
```
### Make sure you use the @EnableOAuth2Sso annotation in your controller. 
I put it just below my @Controller annotation in the MainController file. 


You should see 
index for 
### your_github_username 

when you run the application with the correct settings. 

Enjoy! 