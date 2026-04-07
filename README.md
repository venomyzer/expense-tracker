<div align="center">

# 💸 SMART EXPENSE TRACKER API  
### ⚡ Track · Analyze · Optimize ⚡  

*A scalable backend system for managing expenses, analyzing spending behavior, and generating intelligent insights.*

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Java](https://img.shields.io/badge/Java%2021-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

</div>

---

## ◈ OVERVIEW

**Smart Expense Tracker API** is a backend system designed to manage personal expenses, generate insights, and enforce financial rules.

It provides a structured and scalable architecture for:
- Expense tracking
- Spending analytics
- Rule-based alerts
- Secure user authentication

---

## ◈ CORE FEATURES

- 🔐 JWT-based Authentication & Authorization  
- 💸 Expense Management (CRUD Operations)  
- 📊 Category-wise & Monthly Analytics  
- 🧠 Rule Engine (threshold-based alerts)  
- ⚠️ Centralized Exception Handling  
- 📜 Request Logging using AOP  
- 🧱 Layered Architecture (Controller → Service → Repository)  

---

## ◈ SYSTEM WORKFLOW
```
┌──────────────────────────────────────────────┐
│ CLIENT (Postman/UI)                          │
└──────────────────────────────────────────────┘
                        │
                        ▼
┌──────────────────────────────────────────────┐
│ CONTROLLER LAYER                             │
│ Handles HTTP Requests/Responses              │
└──────────────────────────────────────────────┘
                        │
                        ▼
┌──────────────────────────────────────────────┐
│ SERVICE LAYER                                │
│ Business Logic & Rule Processing             │
└──────────────────────────────────────────────┘
                        │
                        ▼
┌──────────────────────────────────────────────┐
│ REPOSITORY LAYER                             │
│ Database Interaction (JPA)                   │
└──────────────────────────────────────────────┘
                        │
                        ▼
┌──────────────────────────────────────────────┐
│ DATABASE                                     │
│ PostgreSQL                                   │
└──────────────────────────────────────────────┘
```

---

## ◈ RULE ENGINE FLOW
```
╔══════════════════╦══════════════════════════════════════╗
║ LAYER            ║ TECHNOLOGY                           ║
╠══════════════════╬══════════════════════════════════════╣
║ Backend          ║ Spring Boot (Java 21)                ║
║ Database         ║ PostgreSQL                           ║
║ ORM              ║ Spring Data JPA + Hibernate          ║
║ Security         ║ Spring Security + JWT                ║
║ Build Tool       ║ Gradle                               ║
╚══════════════════╩══════════════════════════════════════╝
```
---

## ◈ PROJECT ARCHITECTURE

`src/main/java/com/expensetracker/`

```
├── controller/ → REST API endpoints
├── service/ → Business logic layer
├── repository/ → Data access layer
├── entity/ → Database models
├── dto/ → Request/Response models
├── config/ → Application configuration
├── security/ → Authentication & JWT handling
├── exception/ → Global exception handling
└── aspect/ → Logging (AOP)
```
---

## ◈ DATABASE SCHEMA
```
┌──────────────┐
│ EXPENSES     │
├──────────────┤
│ id (PK)      │
│ amount       │
│ category     │
│ date         │
│ description  │
└──────────────┘
```

*(Can be extended with User, Categories, and Analytics tables)*

---

## ◈ API ENDPOINTS

METHOD ENDPOINT DESCRIPTION

```api
POST /api/auth/signup Register user
POST /api/auth/login Authenticate user

POST /api/expenses Create expense
GET /api/expenses Get all expenses
GET /api/expenses/{id} Get expense by ID
PUT /api/expenses/{id} Update expense
DELETE /api/expenses/{id} Delete expense
```
---


---

## ◈ LOCAL SETUP

### Prerequisites
- Java 21+
- PostgreSQL
- Gradle

### Run Backend

```bash
git clone <your-repo-url>
cd expense-tracker
./gradlew bootRun
```

### Database Setup

```sql
CREATE DATABASE expense_tracker;
```

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/expense_tracker
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## ◈ FUTURE ENHANCEMENTS

- 📊 Frontend Dashboard (React)
- 🤖 AI-based Spending Insights
- 📅 Budget Planning System
- 🔔 Notification Service
- 🐳 Dockerized Deployment


<div align="center">
  
### 🚀 BUILT WITH SCALABILITY & CLEAN ARCHITECTURE IN MIND

</div> 
