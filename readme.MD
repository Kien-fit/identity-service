# Identity service
This microservice is responsible for:
* Onboarding users
* Roles and permissions
* Authentication

## Tech stack
* Build tool: maven >= 3.9.5
* Java: 21
* Framework: Spring boot 3.2.x
* DBMS: MySQL

## Prerequisites
* Java SDK 21
* A MySQL server

## Start application
`mvn spring-boot:run`

## Build application
`mvn clean package`

## Docker guideline
### Create network:
`docker network create identity-network`
### Start MySQL in identity-network
`docker run --network identity-network --name mysql -p 3306:3306 -e MYSQL_ROOT_PASWORD=root -d mysql:8.0.20`
### Start application in identity-network
`docker run --name identity-service --network identity-network -p 8080:8080 -e DBMS_CONNECTION=jdbc:mysql://mysql:3306/identity-service identity-service:1.0.0`
