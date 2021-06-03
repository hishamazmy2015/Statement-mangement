

# This applicaion performs some filtering in how to retrieve the user statements based on some criteria like:
### bank account id
### date range
### amount range

# Technologies used:
java 1.8
spring boot 
spring security
json web token (jwt)
spring aop for logging
Installation guidance
The first step is to take the db (accoundb.accdb) from application folder and paste it into your local drive and then point to it in application.yml and then in the root folder 






# JWT Token will be returned in the Response Header with the key "Authoirzation"
## How To Run
1) Clone the project in your local directory
    git clone https://github.com/hishamazmy2015/Statement-mangement.git
2) Open the project in Intellija


    
### PostMan collection URL
You can simply import the collections attached with Project.


Steps:
1) open postman
2) click on import
3) select the Link.
4) past the link.
Note for POSTMAN ENV: 
    -Select Dev environment.


#### How to run Test Case
    -mvn clean install
    -mvn spring-boot:run
    
##### Assignment detail description
The API should implement the following:

●Users Sign Up with (First Name, Last Name, Email Address,Password, Role[‘admin’,‘user’])
  User can be able to signup as a Admin OR User.
  
    -Method: POST
    -Route URL: http://localhost:9091/api/user/signup
    -Request Body:
    {
     
        "username": "user",
        "password": "user"
    }
	-Response: Token will be returned in the Response Header
	(x-auth)	
●User sign in with JWT tokens

    -Method: POST
    -Route URL: http://localhost:9091/api/auth/login
    -Request Body:
    {
         "username": "admin",
        "password": "admin"
    }
	-Response: Token will be returned in the Response Header
	(x-auth)
●Request to logout

    -Method: POST
    -Route URL: http://localhost:9091/api/auth/logout
    -Header: Pass JWT token in Request header with the key Authorization
    


●Store authenticated user 

    -Method: GET
    -Route URL: http://localhost:9091/api/bank/statements
    -Header: Pass JWT token in Request header with the key Authorization
    -Request Body: None

●Admin user request to list Statements (in case of all params are null return last three months only in case of admin )

    -Method: GET
    -Route URL: localhost:9091/api/bank/statements?accountId=1&fromDate=05.07.2018&toDate=15.11.2020&fromAmount=166.470541608144&toAmount=386.908121686113
    -Header: Pass JWT token in Request header with the key Authorization
    -Request Body:None
    -Response: Returns an array of customer support tickets
    
    
## Resources of Rest API Handle Exception
https://www.toptal.com/java/spring-boot-rest-api-error-handling


    
## Resources of Testing
https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing


## Resources of sonarscanner
https://medium.com/swlh/sonarqube-sonarscanner-setup-1a633b654828


![Capture](https://user-images.githubusercontent.com/12899500/120700577-e0412f80-c4c2-11eb-99ba-b6c5b2f096e7.PNG)



    
