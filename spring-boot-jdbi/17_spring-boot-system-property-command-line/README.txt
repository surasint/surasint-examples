run this command in console
   mvn clean package
run this command in console
   mvn clean spring-boot:run -Dspring-boot.run.jvmArguments="-Dmy_system_properties=test1"
try to access this url
    http://localhost:8080/api/test
then stop the service by Ctrl+C
go to the target folder
run this command
    mvn clean package
run this command
    java -Dmy_system_properties=test1 -jar spring-boot-17-1.0-SNAPSHOT.jar

I have spent quite some time to create such this example. If this example helps you, please donate some Bitcoin(BTC) to 35E8iE7e2YCw3aKRe4NsFkuHAwKkPHtCtg

Trick, for Spring version 1.5.x and below, use this command:
    mvn clean spring-boot:run -Drun.jvmArguments="-Dmy_system_properties=test1"