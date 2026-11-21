# Expense Tracker API 💰

A RESTful web service built with **Spring Boot 3**, **Spring Data JPA**, and **MySQL** for tracking and managing daily personal expenses with custom validation rules and centralized exception handling.

---

## 🚀 Features

- **Expense Management**: Create, retrieve, and track daily expenses.
- **Custom Hibernate / Bean Validation**:
  - `@NotFutureDate`: Ensures expense records cannot be logged in the future.
  - `@ValidateDateFormate`: Custom date format validation (`dd-MM-yyyy`).
  - `@DecimalMin`: Validates that expense amounts are greater than zero.
  - `@NotEmpty`: Ensures description and category are always populated.
- **Global Exception Handling**: Centralized error responses returning structured `ErrorDetails` (timestamp, message, details).
- **Relational Persistence**: Automated schema management with Spring Data JPA and MySQL.

---

## 🛠️ Tech Stack

- **Language**: Java 17+ (Compatible with Java 21)
- **Framework**: Spring Boot 3
- **ORM / Persistence**: Spring Data JPA / Hibernate
- **Database**: MySQL
- **Validation**: Jakarta Bean Validation (`jakarta.validation`)
- **Build Tool**: Maven

---

## 📋 API Endpoints

| Method | Endpoint | Description | Sample Status |
|---|---|---|---|
| `GET` | `/expense` | Health/welcome check | `200 OK` |
| `POST` | `/expense/save` | Create and save a new expense | `201 CREATED` |
| `GET` | `/expense/all/expense` | Retrieve all tracked expenses | `200 OK` |

### Sample Request (`POST /expense/save`)
```json
{
  "description": "Office lunch",
  "amount": 250.00,
  "category": "Food & Dining",
  "expense_Date": "21-11-2026"
}
```

### Sample Response (`201 Created`)
```json
{
  "id": 1,
  "description": "Office lunch",
  "amount": 250.00,
  "category": "Food & Dining",
  "expense_Date": "21-11-2026"
}
```

---

## ⚙️ Configuration & Setup

### 1. Database Setup
Create a MySQL database named `expenses`:
```sql
CREATE DATABASE expenses;
```

### 2. Configure `application.properties`
Update `src/main/resources/application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expenses
spring.datasource.username=${DB_USERNAME:root}
spring.datasource.password=${DB_PASSWORD:your_password}

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build & Run
Using Maven Wrapper:

```bash
# On Linux / macOS
./mvnw clean spring-boot:run

# On Windows PowerShell
.\mvnw.cmd clean spring-boot:run
```

---

## 📂 Project Structure

```
Expense_Tracker/
├── src/
│   ├── main/
│   │   ├── java/com/util/net/expense/tracker/Expense_Tracker/
│   │   │   ├── controller/          # REST Controller endpoints
│   │   │   ├── entity/              # JPA Entity models
│   │   │   ├── exception/           # Custom exceptions & GlobalExceptionHandler
│   │   │   ├── repository/          # Spring Data JPA repositories
│   │   │   ├── service/             # Service interfaces & implementations
│   │   │   └── validation/          # Custom validation annotations & validators
│   │   └── resources/
│   │       └── application.properties
│   └── test/                        # Unit and integration tests
├── .gitignore
├── mvnw / mvnw.cmd                  # Maven wrapper executables
├── pom.xml
└── README.md
```

---

## 👤 Author
- **Aniket Jawanjal** - [GitHub Profile](https://github.com/aniketjawanjal)
