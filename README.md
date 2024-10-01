# JavaCodingRules

## Layering

No business code in the web layer: https://github.com/charroux/JavaCodingRules/blob/main/src/main/java/com/charroux/javaCodingRules/web/WebService.java

## Logger

See line 21 at https://github.com/charroux/JavaCodingRules/blob/main/src/main/java/com/charroux/javaCodingRules/web/WebService.java

See line 16 at https://github.com/charroux/JavaCodingRules/blob/main/src/main/java/com/charroux/javaCodingRules/service/MyService.java

## Exception handling with HttpStatus code and message

https://github.com/charroux/JavaCodingRules/blob/main/src/main/java/com/charroux/javaCodingRules/service/DataException.java

## Open API documentation (Swagger)

See 
```
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0'
```
in https://github.com/charroux/JavaCodingRules/blob/main/build.gradle

View the documentation:
```
http://localhost:8080/swagger-ui/index.html
```

## Testing

### Unit testing

Documentation: https://junit.org/junit5/docs/current/user-guide/#writing-tests

Test class: https://github.com/charroux/JavaCodingRules/blob/main/src/test/java/com/charroux/javaCodingRules/data/MyDataTest.java

### Web tier testing

Mockito example 1: https://github.com/charroux/mockito

Mockito example 2: https://mkyong.com/spring-boot/testing-json-in-spring-boot/

Test class: https://github.com/charroux/JavaCodingRules/blob/main/src/test/java/com/charroux/javaCodingRules/web/WebServiceTest.java

### Launch the tests
```
./gradlew build
```
Check the results: see the HTML page in build/reports/test/tests/index.html

