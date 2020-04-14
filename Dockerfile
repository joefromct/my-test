FROM openjdk:8-alpine

COPY target/uberjar/my-test.jar /my-test/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/my-test/app.jar"]
