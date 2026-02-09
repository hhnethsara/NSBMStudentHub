# NSBM Student Hub – DEA In-Class Activity

## 📘 Module
**DEA (Database Engineering / Data Engineering Architecture)**  
In-Class Practical Activity

## 🧑‍🎓 Student
**Name:** Nethsara Vimukthi  
**Degree Program:** BSc (Hons) Computer Science  
**University:** NSBM Green University

---

## 📌 Project Overview
This project is a **small in-class activity** conducted for the DEA module.  
The objective of this activity is to demonstrate **basic backend configuration**, **database connectivity**, and **error identification** using a Spring Boot application with MySQL.

The project focuses on:
- Understanding JDBC database connections
- Configuring Hibernate and Spring Data JPA
- Identifying and fixing common database errors

---

## 🛠️ Technologies Used
- **Java**
- **Spring Boot**
- **Hibernate ORM**
- **MySQL**
- **Maven**
- **HikariCP (Connection Pool)**

---

## 🗄️ Database Configuration
The application connects to a MySQL database using the following configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nsbmstudent\?createDatabaseIfNotExist = true
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
