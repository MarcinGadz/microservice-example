# microservice-example
Basic app to play with some microservice design patterns and frameworks/tools  
  
Two simple services, communicated through Feign Client, using service discovery based on Netflix Eureka and Spring Cloud Gateway for routing, with additional configs to run it on docker
If it is started with startup.sh from this repo, urls looks like:
- localhost:8761 - `Netflix Eureka Server`
- localhost:5555 - `Spring Cloud Gateway`
  - /user - mapping to `user-service`
    - /user/{username}/orders - get orders (from `order-service`) for specified user
  - /order - mapping to `order-service`
- localhost:27017 - `mongoDB`
- localhost:8080 - `user-service` directly
- localhost:8081-2 - two instances of `order-service`
