# spring-microservices
## Import topics covered here - 
For further reference, please consider the following sections:

* Microservices using [spring boot](https://spring.io/blog/2015/07/14/microservices-with-spring) 
* Implementation of [open feign](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html) client 
* Implementation of [Eureka](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html) server and client 
* Implementation of client based [load balancing](https://spring.io/guides/gs/spring-cloud-loadbalancer/) 
  (Added in Student Service for Address Service)
* Implementation of [Spring cloud API gateway](https://spring.io/projects/spring-cloud-gateway)
* Fault tolerance and circuit break with [Resilience4j](https://resilience4j.readme.io/docs) and Spring AOP.
* Distributed Tracing with [Sleuth and Zipkin](https://spring.io/blog/2016/02/15/distributed-tracing-with-spring-cloud-sleuth-and-spring-cloud-zipkin) 


## Getting Started 


1. Setup and [run mysql on local machine](https://www.prisma.io/dataguide/mysql/setting-up-a-local-mysql-database), then dump the data given in `helper-files` directory like 

```
mysql -u root < helper-files/university.db.sql 
```
2. Change database connection credentials everywhere in `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/university
spring.datasource.username=root
spring.datasource.password=root_pass
```
3. Each microservices can be build and run by following [maven](https://maven.apache.org/) command from the respective directory 

```
mvn spring-boot:run
```
4. For all local request and testing you can use following postman collection via import option in [Postman](https://www.postman.com/downloads/) - 
> [Postman localhost API endpoint collection](https://www.getpostman.com/collections/e9ec883b436965c3de45)

5. Spring version used here is - 

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.1)
 ```