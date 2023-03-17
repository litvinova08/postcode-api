# Postcode API - in Progress

## Description
The purpose of this project is to create an API in Java that allows clients to retrieve suburb and postcode combinations. The app should have a persistent database

## The tech stack I used
This is a fullstack application I used as of 17.03.2023:
- **Java Spring Boot** is a powerful Java framework that makes it easy to develop high-performing, production-ready applications. 
Spring Boot provides a variety of features that make it easy to build, test, and deploy applications.
- **MySQL** provides data storage and retrieval capabilities.

## Compiling and running the app
Clone the repo to your own device
```
git init
git clone https://github.com/litvinova08/postcode-api.git
```
Open the backend folder in Eclipse or another integrated development environment of your choice:

- File > Import > Maven > Existing Maven Projects > Browse for the "postcode-api" folder

### Set up a Database
Set up a database using MySQL Workbench. Please, make sure that YOUR_MYSQL_DB_NAME is the same as the DB name in your application.properties file:

`CREATE DATABASE <YOUR_MYSQL_DB_NAME>`


Use the database:

`USE <YOUR_MYSQL_DB_NAME>`


Create a table schema:

`CREATE TABLE suburb (
    postcode varchar(255),
    suburb varchar(255),
    stateName varchar(255),
    stateCode varchar(255),
    latitude varchar(255),
    longitude varchar(255),
    accuracy varchar(255)
);`

Download suburb data:
copy data from https://github.com/Elkfox/Australian-Postcode-Data/blob/master/au_postcodes.csv into a txt file FILE_NAME.txt

`LOAD DATA LOCAL INFILE '/path/FILE_NAME.txt' INTO TABLE suburb FIELDS TERMINATED BY ',';`


Run the app
- You can Run the app by pressing the green play button
- You can access data either via a browser or Postman accessing the following endpoints:
  - http://localhost:8080/postcodes to get the list of all suburbs
  - http://localhost:8080/postcodes/postcode={postcode} to get a record by a postcode
  - http://localhost:8080/postcodes/suburb={suburb} to get a record by a suburb name
  
  ![image](https://user-images.githubusercontent.com/37922356/225819145-a9ecc984-64be-41fc-9678-6fa7ba7853ed.png)


## Dependencies used
- JPA Queries https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

## Acknowledgments
Data imported from https://github.com/Elkfox/Australian-Postcode-Data/blob/master/au_postcodes.csv
