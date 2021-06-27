# SPRING BOOT 2.5.1

## SETUP

`https://start.spring.io/`

- Maven project
- Java
- Spring Boot 2.5.1
- Packaging Jar
- Java 8

## PACKAGE
### Spring Web (WEB)
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

### PostgreSQL Driver (SQL)
A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.

### Flyway Migration (SQL)
Version control for your database so you can migrate from any version (incl. an empty database) to the latest version of the schema.

### Spring Data JPA (SQL)
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

### Lombok (DEVELOPER TOOLS)
Java annotation library which helps to reduce boilerplate code.

### Thymeleaf (TEMPLATE ENGINES)
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.

## INSTALLATION

### SPRING BOOT
`mvn clean package -DskipTest`

### DATABASE (POSTGRES)

- Running postgresql
```
    sudo docker run --rm \
        --name sandbox_spring_boot \
        -e POSTGRES_DB=sandbox_spring_boot \
        -e POSTGRES_USER=universe \
        -e POSTGRES_PASSWORD=        \
        -e PGDATA=/var/lib/postgresql/data:z/pgdata \
        -v "$PWD/database:/var/lib/postgresql/data:z" \
        -p 5432:5432 \
        postgres:13
```

- Access via terminal
`psql -h 127.0.0.1 -U universe sandbox_spring_boot`

### MIGRATION
`mvn clean spring-boot:run`  
`mvn spring-boot:run`