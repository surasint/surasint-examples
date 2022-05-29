create database named "testdb"
run db script (dbscript.sql)
change database username and password in applicaiton.properties
run this command in console
   mvn clean package
run this command in console
   mvn clean spring-boot:run
you can try to access these URLs
   To create new row in database
        http://localhost:8080/api/user/insertOK
   To create new row in database and throw exception (it will rollback)
        http://localhost:8080/api/user/insertNotOK
   To see rows from database
        http://localhost:8080/api/user//api/user/list

I have spent quite some time to create such this example. If this example helps you, please donate some Bitcoin(BTC) to 35E8iE7e2YCw3aKRe4NsFkuHAwKkPHtCtg