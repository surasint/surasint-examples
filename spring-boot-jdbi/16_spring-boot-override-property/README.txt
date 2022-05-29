run this command in console
   mvn clean package
go to the target folder and run this command
    java -jar spring-boot-16-1.0-SNAPSHOT.jar
try to access this url
    http://localhost:8081/test/api/count
Stop the process (ctrl+c), then run this command
    java -jar spring-boot-16-1.0-SNAPSHOT.jar --spring.config.location=classpath:application.properties,../override.properties
try to access this url
    http://localhost:8888/test/api/count

I have spent quite some time to create such this example. If this example helps you, please donate some Bitcoin(BTC) to 35E8iE7e2YCw3aKRe4NsFkuHAwKkPHtCtg