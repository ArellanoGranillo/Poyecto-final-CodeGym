## [REST API](http://localhost:8080/doc)

## Concept:

- Spring Modulith
    - [Introduction to Spring Modulith](https://www.baeldung.com/spring-modulith)
    - [Introducing Spring Modulith](https://spring.io/blog/2022/10/21/introducing-spring-modulith)
    - [Spring Modulith - Reference documentation](https://docs.spring.io/spring-modulith/docs/current-SNAPSHOT/reference/html/)

```
  url: jdbc:postgresql://localhost:5432/jira
  username: jira
  password: CodeGymJira
```

- There are two tables, which do not have foreign keys
    - _Reference_ - directory. Make the link using _code_ (using id is not allowed, as id is tied to the environment-specific base)
    - _UserBelong_ - link users with type (owner, lead, ...) to object (task, project, sprint, ...). FK will be checked manually

## Analogues

- https://java-source.net/open-source/issue-trackers

## Testing

- https://www.youtube.com/watch?v=aEW8ZH6wj2o

Project Updates
Completed Tasks
---Understand the project structure (onboarding)

---Delete social network(s)

Removed Facebook login integration.

Commented out the following sections in login.html and register.html:

<!--
</a>
<a class="btn btn-primary btn-lg me-2" href="/oauth2/authorization/facebook" style="padding-left: 17px; padding-right: 17px;" type="button">
    <i class="fa-brands fa-facebook"></i>
</a>
-->

---Put sensitive information into a separate property file

Created secrets.properties to store sensitive information securely.

---Rework the tests to use H2 in-memory database

Modified application-test.properties and application-test.yaml.

Created two profiles in DataSourceConfig to run the application with H2.

Migrated the content of test-data.sql to H2.

Disabled Liquibase completely for tests.

Note: Tests currently fail when running with the H2 configuration.

---Docker setup

Wrote a Dockerfile for the main server.

Created a docker-compose.yml file.

Added a .dockerignore file.

---Update README.md

