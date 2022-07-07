# spring-microservices
## Import topics covered here - 
For further reference, please consider the following sections:

* Microservices using [spring boot](https://spring.io/blog/2015/07/14/microservices-with-spring) 
* Implementation of [open feign](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html) client 
* Implementation of [Eureka](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html) server and client 
* Implementation of client based [load balancing](https://spring.io/guides/gs/spring-cloud-loadbalancer/) 
  (Added in Student Service for Address Service)
* Implementation of API gateway  


## Getting Started 


1. Setup and run mysql on local machine, then dump the data given in `database_file` directory like 

```
mysql -u root < university.db.sql 
```
2. Change database connection credentials everywhere in `application.properties`

```
spring.datasource.username=root
spring.datasource.password=root_pass
```
3. Each microservices can be build and run by following command from the respective directory 

```
mvn spring-boot:run
```

4. Spring version used here is - 

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.1)
 ```