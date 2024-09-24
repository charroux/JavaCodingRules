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

## testing

### Unit testing

Documentation: https://junit.org/junit5/docs/current/user-guide/#writing-tests

Test class: 