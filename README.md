# DBAPP

## 데이터 베이스 생성 방법
```sql
CREATE USER 'korea'@'%' IDENTIFIED BY 'korea1234';
GRANT ALL PRIVILEGES ON *.* TO 'korea'@'%';
CREATE DATABASE koreadb;
```

### 추가 의존성
```java
<dependency>
	<groupId>org.apache.tomcat</groupId>
	<artifactId>tomcat-jasper</artifactId>
	<version>9.0.46</version>
</dependency>

<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
	<version>1.2</version>
</dependency>

```

### JSPL 태그 라이브러리
```jsp
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
```

### application.yml
```yml
server:
 port: 8000
 servlet:
    encoding:
     charset: UTF-8
      
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp

  datasource:
    driver-class-name: org.mariadb.jdbc.Driver
    username: korea
    password: korea1234
    url: jdbc:mysql://localhost:3306/koreadb
    
  jpa:
    hibernate:
      ddl-auto: none # create, update, none
    show-sql: true
```