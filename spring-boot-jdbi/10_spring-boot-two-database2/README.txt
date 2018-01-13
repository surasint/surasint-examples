create database named "testdb"
run db script (dbscript.sql)
change database username and password in applicaiton.properties
run this command in console
   mvn clean package
run this command in console
   mvn clean spring-boot:run
you can try to access these URLs
   To create new row in database
        http://localhost:8080/api/user1/insertOK
        http://localhost:8080/api/user2/insertOK
        http://localhost:8080/api/user/insertBothOK
   To create new row in database and throw exception (it will rollback)
        http://localhost:8080/api/user1/insertNotOK
        http://localhost:8080/api/user2/insertNotOK
        http://localhost:8080/api/user/insertBothNotOK
   To create list rows from database
        http://localhost:8080/api/user1/list
        http://localhost:8080/api/user2/list

For more detail, visit here:
    https://www.surasint.com/spring-boot-multiple-databases/