## API Gateway
Endpoints:
- http://localhost:9090 / 192.168.1.2:9090/expense
- GET : http://localhost:9090/expense
- GET : http://localhost:9090/expense/{id}
- DELETE : http://localhost:9090/expense/{id}
- POST : http://localhost:9090/expense (body: ExpenseDTO)
```properties
spring.application.name=api-gateway
server.port=9090
```
---
## Eureka Server
- http://localhost:8761/
```properties
spring.application.name=eureka-server
server.port=8761
```
---
## Core
- Swagger UI: http://localhost:8090/swagger-ui/index.html#/
```properties
spring.application.name=core-service
server.port=8090
```
---
## Expense
- Swagger UI: http://localhost:8080/swagger-ui/index.html#/
```properties
spring.application.name=expense-service
server.port=8080
```