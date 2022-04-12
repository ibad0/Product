SPRINGBOOT
1)Created a spring boot app using spring initializr.
2)Added spring web, spring data jpa,mysql dependencies to project. add mysql database details and hibernate mappings in application.properties file
3)Create a product model
5)create a repository which extends the CrudRepository for Product model
6)add service interface which has all business logic method definations for CRUD operations
7)implement the above service interface
8)create a product controller and all handler methods for CRUD ops.


SPRING SECURITY+JWT token
9)add spring security dependency
10)create a class SecurityConfigurer which extends the WebSecurityConfigurerAdapter to customize the spring security.
11)Now add jjwt and jaxb-api dependencies in class path
12)create class Jwttil which has all imp methods for jwt like vakidate, create.
13)create a "/authenticate" api endpoint which takes the username and pwd and generate token.
14)create a JWT request model 
15)create JWTresponse model.
16)Create Authenticatecontroller which generates the token if username and pwd are valid.
17)exclude methods like "/product/all" and "/generate-token" which dont require to be authenticated in securityConfigurer.
19Now intercept the incoming req. take jwt from req and find username and validate the token for every request.

unit testing
1)Add required annotations for Testclass
2)create test method for each handler method
