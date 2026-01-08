# Copilot Hello World REST

A simple REST service built with Spring Boot that provides a "Hello World" endpoint.

## Description

This is a basic Spring Boot application that demonstrates a RESTful web service with Spring Boot Actuator for monitoring and management.

## Technologies

- Java 17
- Spring Boot 3.2.2
- Spring Web
- Spring Boot Actuator
- Maven

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## Building the Project

```bash
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

Or run the compiled JAR:

```bash
java -jar target/copilot-1.0.0.jar
```

## API Endpoints

The application provides REST endpoints that can be tested using the included `test.http` file.

## Health Check

Spring Boot Actuator provides health check endpoints at:
- `/actuator/health`

## Project Structure

```
src/
├── main/
│   └── java/
│       └── com/example/copilot/
│           ├── Main.java
│           └── HelloController.java
```

## License

This project is a simple example application.
