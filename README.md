# spring-boot-factory-design-pattern
Implementing factory and builder design pattern in spring boot.

API created as below: http://localhost:8080/swagger-ui.html http://localhost:8080/home/arthimaticOperations

Demonstration of how to use builder design pattern for complex object creation with help of lombok in spring boot. Advantage:- Lombok @Builder annotation takes care of all the code that is required for builder pattern creatiion. Reduces boilerplate coding.

Demonstration of how to implement Factory pattern:

Creates objects without exposing the instantiation logic to the client.
Refers to the newly created object through a common Abstract class, can be even done with interface
Swagger link Below: http://localhost:8080/swagger-ui.html

List of API:http://localhost:8080/home/arthimaticOperations

#Sample request body for post method below:

{ "a": 10, "b": 5, "result": 0, "type": "add" }
