<h1 align="center">Todo App</h1>

A basic Todo List application built with **Spring Boot** and **MySQL**.

## Features

- Allow users to:
	- Add a task.
	- Mark a task as completed.
	- Delete a task.
	- View the list of tasks.

## Tech Stack

- **Java 17**
- **Maven**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL**
- **Postman**

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/DanushH/Todo-App-Spring-Boot.git
cd Todo-App-Spring-Boot
```

### Install Dependencies

- Ensure you have **Java 17+** and **Maven** installed.
- Update `src/main/resources/application.properties` with your MySQL database credentials:

```
spring.datasource.url=jdbc:mysql://localhost:3306/[db_name]
spring.datasource.username=[user]
spring.datasource.password=[password]
```

### Run the Application

```sh
mvn clean install
mvn spring-boot:run
```

The server will start on **`http://localhost:8080`**

## API Endpoints

### Create a Todo Item

```http
POST /todos
```

**Request Body (JSON)**

```json
{
  "itemName": "Learn Spring Boot"
}

```

### Retrieve All Todos

```http
GET /todos
```

### Toggle Todo Completion

```http
PATCH /todos/{id}/toggle
```

### Delete a Todo Item

```http
DELETE /todos/{id}
```

## License

This project is licensed under the MIT License.

## Contact

[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- MARKDOWN LINKS & IMAGES -->
[linkedin-shield]: https://img.shields.io/badge/Linkedin-black?style=for-the-badge&logo=linkedin&logoColor=%230277BD
[linkedin-url]: https://linkedin.com/in/danushika-herath
