## PERSON RESTful API

An example PERSON RESTful API built on Spring Boot.

## Features

- RESTful API.
- Models with proper relationships.
- Controllers/Models etc with proper separation.
- oauth Authentication, used inMemoryAuthentication.
- Hibernate used for ORM.
- AngularJS v1.3, Bootstrap v3.3.7 used for Front end.
- For testing, H2 database used.
- Proper Integration Test.

## Redis Cache

Redis cache is used for cache management feature offered by Redis. Redis is normally used as a cache to store repeatedly accessed data in memory so that to increase our application performance. 

##  @EnableCaching 
We apply this annotation at the main class (starter class) of our application in order to tell Spring Container that we need Caching feature in our application.

## @Cacheable 
@Cacheable is used to fetch data from the DB to application and store in Redis Cache.

##  @CachePut 
We use @CachePut in order to update data in the redis cache while there is any update of data in DB.

##  @CacheEvict 
We use @CachePut in order to remove data from Redis Cache while there is any removal of data in DB.

## Redis Dependencies

The below dependency add caching support and bring in all the required dependencies.

 	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-redis</artifactId>
	</dependency>

## Redis Quick Start

Follow the link : https://redis.io/topics/quickstart

## start and stop Redis server on Mac

Getting started with Redis is quite easy and straightforward. Using Homebrew, you can get it up and running within a couple of commands:

To install Redis on Mac: 
    <strong>brew install redis</strong>

Start Redis server: 
    <strong>brew services start redis</strong>

Stop Redis server: 
    <strong>brew services stop redis</strong>

Restart Redis server: 
    <strong>brew services restart redis</strong>

Run command redis-cli ping. If response to this command is <strong>PONG</strong>, your redis server is running ok.

# To Access API UI

ULR: http://localhost:8080/api/v1/home

![Home Page](https://github.com/Bharathidasan-tech/RESTfulAPI-springboot-person-api/blob/main/documents/screens/screen_1.png)

![Add Person Details](https://github.com/Bharathidasan-tech/RESTfulAPI-springboot-person-api/blob/main/documents/screens/screen_2.png)

![Update Person Details](https://github.com/Bharathidasan-tech/RESTfulAPI-springboot-person-api/blob/main/documents/screens/screen_3.png)

### API Access

METHOD | PATH                                                  | DESCRIPTION 
-------|-------------------------------------------------------|------------
POST   | /oauth/token                                          | get oauth token to access the API
GET    | /api/v1/person/?access_token={token_value}            | get all person list
GET    | /api/v1/person/{person_id}?access_token={token_value} | get person details by ID list
POST   | /api/v1/person/?access_token={token_value}            | save person details 
PUT    | /api/v1/person/?access_token={token_value}            | update person
DELETE | /api/v1/person/{person_id}?access_token={token_value} | delete person
