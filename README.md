# 🚀 Spring Boot Learning Journey  

This repository documents my learning path in **Java Backend Development** — starting from the basics (JDBC) and progressing towards building **scalable microservices** with deployment on Docker & AWS.  

Each stage is organized in separate folders/branches with working code and explanations.  

---

## 📌 Topics Covered  

### 1. Core Java & JDBC
- JDBC connection setup with PostgreSQL/MySQL  
- CRUD operations using `Statement` & `PreparedStatement`  
- Transaction handling  

### 2. Spring Framework (Core + IOC + DI + AOP)
- Understanding **Inversion of Control (IoC)** & **Dependency Injection (DI)**  
- Spring Bean lifecycle  
- Aspect-Oriented Programming (AOP) basics  

### 3. Spring Boot
- Auto-configuration & starter dependencies  
- Building first REST API with Spring Boot  
- Project structure & best practices  

### 4. Spring Data JPA & Hibernate
- Defining Entities & Repositories  
- One-to-One, One-to-Many, Many-to-Many relationships  
- JPQL & Native Queries  
- Pagination & Sorting  

### 5. REST API Development
- CRUD APIs with proper response handling  
- Exception Handling (`@ControllerAdvice`)  
- Validation with `@Valid` and `Hibernate Validator`  
- DTOs & ModelMapper  

### 6. Spring Security 6
- Role-based Authentication & Authorization  
- Password Encoding (BCrypt)  
- Method-level security with `@PreAuthorize`  

### 7. JWT (JSON Web Token)
- User authentication with JWT  
- Token generation & validation  
- Securing APIs with JWT filter  

### 8. Microservices (Upcoming 🚧)
- Service discovery with **Eureka**  
- API Gateway with **Spring Cloud Gateway**  
- Inter-service communication (Feign Client / RestTemplate / WebClient)  
- Centralized configuration with **Spring Cloud Config**  

### 9. Docker
- Writing a `Dockerfile` for Spring Boot application  
- Building and running Docker containers  
- Using **Docker Compose** for multi-container setup (App + DB)  
- Preparing Docker images for AWS deployment  

### 10. Deployment on AWS
- Packaging with **Maven**  
- Deploying Spring Boot App on **AWS EC2**  
- Using **AWS RDS** for database  
- Running Docker containers on **AWS EC2 / ECS**  

---

## 🛠️ Tech Stack
- **Language:** Java 17+  
- **Frameworks:** Spring Framework, Spring Boot, Spring Security  
- **Database:** PostgreSQL / MySQL  
- **ORM:** Hibernate / JPA  
- **Authentication:** JWT  
- **Containerization:** Docker, Docker Compose  
- **Tools:** Maven, Postman  
- **Cloud:** AWS (EC2, RDS, S3, ECS)  

---

## 📂 Repository Structure  

```bash
spring-boot-learning-journey/
│── 01-jdbc/
│── 02-spring-core/
│── 03-spring-boot-rest-api/
│── 04-spring-data-jpa/
│── 05-spring-security-jwt/
│── 06-microservices/
│── 07-docker/
│── 08-deployment-aws/
