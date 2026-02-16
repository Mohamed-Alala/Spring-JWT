# Spring JWT Authentication Project

This is a Spring Boot project that demonstrates the implementation of JWT (JSON Web Token) authentication and authorization.

## Table of Contents

* [Project Structure](#project-structure)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Setup](#setup)
* [Usage](#usage)
* [Endpoints](#endpoints)
* [License](#license)

## Project Structure

```
com.example.springjwt
│
├─ config
│   └─ EnvConfig.java                 # Configuration for environment variables
│
├─ controllers
│   ├─ AuthenticationController.java  # Handles authentication requests (login, token generation)
│   └─ MainController.java            # Main API endpoints requiring authentication
│
├─ entity
│   └─ User.java                      # User entity representing application users
│
├─ repository
│   └─ UserRepository.java            # JPA repository for User entity
│
├─ security
│   ├─ AuthEntryPointJwt.java         # Handles unauthorized access attempts
│   ├─ AuthTokenFilter.java           # JWT token validation filter
│   ├─ JwtUtil.java                   # Utility class for generating and validating JWTs
│   └─ WebSecurityConfig.java         # Spring Security configuration
│
├─ Service
│   └─ CustomUserDetailsService.java  # Loads user details for authentication
│
└─ SpringJwtApplication.java          # Main Spring Boot application class
```

## Technologies Used

* Java 17+
* Spring Boot 3+
* Spring Security
* JWT (JSON Web Tokens)
* Spring Data JPA
* Maven
* H2 / PostgreSQL / MySQL (configurable in application properties)

## Features

* User authentication using JWT
* Token validation for secured endpoints
* Custom user details service
* Role-based access can be extended
* Centralized configuration via `EnvConfig`

## Setup

1. Clone the repository:

```bash
git clone <repository-url>
cd spring-jwt
```

2. Configure database connection in `application.properties` or `application.yml`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jwtdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. Build the project using Maven:

```bash
mvn clean install
```

4. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

## Usage

* The `AuthenticationController` handles login requests and returns a JWT token.
* Include the token in the `Authorization` header as `Bearer <token>` to access protected endpoints in `MainController`.

## Endpoints

| Endpoint             | Method | Description                      |
|----------------------| ------ | -------------------------------- |
| `/api/v1/auth/login` | POST   | Authenticate user and return JWT |
| `/api/v1/user`       | GET    | Example secured endpoint         |


