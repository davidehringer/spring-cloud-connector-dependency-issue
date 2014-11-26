spring-cloud-connector-dependency-issue
=======================================

See https://github.com/spring-cloud/spring-cloud-connectors/issues/88

To reproduce, run the test:
```
mvn clean test
```
To resolve, uncomment the additional dependencies in the POM.
