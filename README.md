JournalApplication
# Journal Application 📓

A robust RESTful API built with Spring Boot for managing personal journal entries. This project features a clean layered architecture and integrated security.

## Features

- User Authentication: Secure signup and login using Spring Security.
- Journal Management: Full CRUD operations (Create, Read, Update, Delete) for journal entries.
- Role-Based Access: Specialized endpoints for Users and Admins.
- Encrypted Passwords: Uses Bcrypt hashing for user security.
- Layered Architecture: Organized into Controller, Service, and Repository layers for scalability.

## Tech Stack

Backend
- Java 25
- Spring Boot 3.5.x
- Spring Security
- Spring Data MongoDB

Database
- MongoDB Atlas (Cloud)

Tools
- Maven (Build Tool)
- Postman (API Testing)
- Git

Project Structure

src
 └── main
     ├── controller
     ├── service
     ├── repository
     ├── entity
     └── JournalApplication.java

API Endpoints

| Method | Endpoint | Description |
| POST | /journal | Create journal entry |
| GET | /journal | Retrieve all journal entries |
| PUT | /journal/{id} | Update journal entry |
| DELETE | /journal/{id} | Delete journal entry |

Running the Project

Clone the repository

```bash
git clone https://github.com/SumitGujariya/JournalApplication--
```

Navigate to project directory

```bash
cd JournalApplication--
```

Run the application

```bash
mvn clean install
mvn spring-boot:run
```

The server will start on:

http://localhost:8080

 Future Improvements

- User authentication with JWT
- User-specific journal entries
- Search journal entries by keyword
- API validation and error handling

---

## Author

Sumit Gujariya  
GitHub: https://github.com/SumitGujariya
