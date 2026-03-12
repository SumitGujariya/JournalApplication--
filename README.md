JournalApplication
Journal Application API

A backend REST API built using Spring Boot for managing personal journal entries.  
The application allows users to create, retrieve, update, and delete journal entries through structured REST endpoints.

## Features

- Create journal entries
- Retrieve all journal entries
- Update existing journal entries
- Delete journal entries
- Clean layered backend architecture (Controller → Service → Repository)

## Tech Stack

Backend
- Java
- Spring Boot
- Spring Data JPA

Database
- MongoDB

Tools
- Maven
- Git
- Postman

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
