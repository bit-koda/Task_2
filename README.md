# Financial Advisor Data Model

## Overview

This project implements the data model for a Financial Advisor Management System using Spring Boot and JPA.

The system allows financial advisors to manage their clients and their investment portfolios.

## Features

- Manage financial advisors
- Manage clients
- Associate clients with advisors
- Create client portfolios
- Track securities within portfolios

## Entity Relationship Model

### Advisor
- Can manage multiple clients.

### Client
- Belongs to one advisor.
- Owns one portfolio.

### Portfolio
- Belongs to one client.
- Contains zero or more securities.

### Security
Each security stores:
- Name
- Category
- Purchase Date
- Purchase Price
- Quantity

## Relationships

```
Advisor
   |
   | 1
   |
   | *
 Client
   |
   | 1
   |
   | 1
Portfolio
   |
   | *
   |
   | *
Security
```

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Maven
- Relational Database

## Project Structure

```
src/main/java/com/wellsfargo/counselor/
│
├── Entrypoint.java
└── entity/
    ├── Advisor.java
    ├── Client.java
    ├── Portfolio.java
    └── Security.java
```

## JPA Requirements

Each entity:
- Uses `@Entity`
- Has an auto-generated primary key
- Uses JPA relationship annotations
- Includes a constructor for all fields
- Includes a default constructor
- Provides getters and setters

## Data Model

### Advisor
- id
- firstName
- lastName
- clients

### Client
- id
- firstName
- lastName
- advisor
- portfolio

### Portfolio
- id
- client
- securities

### Security
- id
- name
- category
- purchaseDate
- purchasePrice
- quantity

## Build

```bash
mvn clean install
```

## Run

```bash
mvn spring-boot:run
```

## Assignment Goals

- Implement the provided ERD.
- Create JPA entity classes.
- Model relationships correctly.
- Support future CRUD operations for advisors, clients, portfolios, and securities.