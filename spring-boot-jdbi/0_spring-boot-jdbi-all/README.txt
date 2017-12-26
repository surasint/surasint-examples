create database named "testdb"
run db script (dbscript.sql)
change database username and password in applicaiton.properties
run this command in console
   mvn clean package
run this command in console
   mvn clean spring-boot:run
you can try to access these URLs
   To create new row in database
        http://localhost:8080/test/api/user/insertOK
   To create new row in database and throw exception (it will rollback)
        http://localhost:8080/test/api/user/insertNotOK
   To see rows from database
        http://localhost:8080/test/api/user/list
   To test filter:
        http://localhost:8080/test/api/count
        http://localhost:8080/test/api/count2
you can try to edit webapp/static/test-static.txt and go to  http://localhost:8080/test/static/test-static.txt
you can try to edit webapp/WEB-INFO/jsp/testjsp-view.jsp and go to  http://localhost:8080/test/testjsp

For more detail, visit here:
      https://www.surasint.com/spring-boot-all/