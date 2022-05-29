create database named "testdb" and "testdb2"
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
        http://localhost:8080/api/userAll/insertOK
   To create new row in database and throw exception (it will rollback)
        http://localhost:8080/api/user1/insertNotOK
        http://localhost:8080/api/user2/insertNotOK
        http://localhost:8080/api/user/insertBothNotOK
        http://localhost:8080/api/userAll/insertAllOK
   To create list rows from database
        http://localhost:8080/api/user1/list
        http://localhost:8080/api/user2/list

I have spent quite some time to create such this example. If this example helps you, please donate some Bitcoin(BTC) to 35E8iE7e2YCw3aKRe4NsFkuHAwKkPHtCtg
