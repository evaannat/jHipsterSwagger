# jHipsterSwagger

This application was created using Spring Initializr in IntelliJ with support of jHipster.

## Dependencies

Spring Web<br />

Spring Data JPA<br />

H2 Database<br />

Swagger2<br />

Swagger-UI<br />

## What it does 

There are 2 entities: Student and Interest in Many-To-Many relationship<br />

<strong>Student (\*) <-----> (\*) Interest</strong><br />

A Student can have many interests, but also many students can have one interest.<br />

Each student has an id, a name, a last name and can have many interests.<br />

You can perform basic CRUD operations on these entities.<br />

## Testing

To test this application in Swagger, run it in IDE and then go to: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) 