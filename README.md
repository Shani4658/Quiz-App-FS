# 🧠 Quiz App

A full-stack Quiz Application built using Java, Spring Boot, and REST APIs. The application allows users to create quizzes, manage questions, attempt quizzes, and calculate scores dynamically.

This project demonstrates backend development concepts including REST API development, layered architecture, database interaction, and Spring Boot application design.

---

# 🚀 Features

## ❓ Question Management

* Add new quiz questions
* Fetch all questions
* Filter questions by category
* Delete or manage questions

## 📝 Quiz Management

* Create quizzes dynamically
* Generate quizzes using categories
* Fetch quiz questions
* Submit quiz answers
* Calculate quiz scores automatically

## ⚡ REST API Support

* RESTful API architecture
* JSON-based request & response handling
* Layered backend structure

## 🗄️ Database Integration

* Persistent data storage
* JPA/Hibernate integration
* MySQL database connectivity

---

# 🛠️ Tech Stack

## Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Maven

## Database

* MySQL

## Tools

* Postman
* IntelliJ IDEA / VS Code
* Git & GitHub

---

# 📂 Project Structure

```bash
src/main/java/com/telusko/quiz_app/
│
├── controller/
│   ├── QuestionController.java
│   └── QuizController.java
│
├── dao/
├── model/
├── service/
└── QuizAppApplication.java
```

---

# ⚙️ Installation & Setup

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/Shani4658/quiz-app.git
cd quiz-app
```

---

## 2️⃣ Configure Database

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

## 3️⃣ Install Dependencies

```bash
mvn clean install
```

---

# ▶️ Running the Application

Run the Spring Boot application:

```bash
mvn spring-boot:run
```

Application runs on:

```bash
http://localhost:8080
```

---

# 📡 API Endpoints

## Question APIs

| Method | Endpoint                        | Description                 |
| ------ | ------------------------------- | --------------------------- |
| GET    | `/question/allQuestions`        | Fetch all questions         |
| GET    | `/question/category/{category}` | Fetch questions by category |
| POST   | `/question/add`                 | Add a new question          |
|        |                                 |                             |

## Quiz APIs

| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| POST   | `/quiz/create`      | Create a new quiz   |
| GET    | `/quiz/get/{id}`    | Get quiz questions  |
| POST   | `/quiz/submit/{id}` | Submit quiz answers |

---

# 🧠 Application Workflow

1. Admin adds questions into the database
2. Questions are categorized by topic
3. Users create or attempt quizzes
4. Quiz answers are submitted
5. Application calculates and returns the final score

---

# 🏗️ Architecture

The project follows a layered architecture:

* **Controller Layer** → Handles API requests
* **Service Layer** → Business logic implementation
* **DAO Layer** → Database operations
* **Model Layer** → Entity classes

---

# 🧪 Testing APIs

You can test APIs using:

* Postman
* Thunder Client
* Swagger (if integrated)

---

# 📦 Build for Production

```bash
mvn clean package
```

Generated JAR file:

```bash
target/quiz-app-0.0.1-SNAPSHOT.jar
```

Run JAR:

```bash
java -jar target/quiz-app-0.0.1-SNAPSHOT.jar
```

---

# 🎯 Future Improvements

* Add User Authentication
* Add Frontend UI using React.js
* Add Timer-based Quiz System
* Add Leaderboard Feature
* Add Difficulty Levels
* Add JWT Security
* Convert into Microservices Architecture

---

# 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to your branch
5. Open a Pull Request

---

# 📄 License

This project is built for educational and learning purposes.

---

# 👨‍💻 Author

**Shani Dev Kashyap**

Java Backend Developer | Spring Boot Enthusiast | Full Stack Learner

---

# ⭐ Support

If you found this project useful, give it a ⭐ on GitHub.
