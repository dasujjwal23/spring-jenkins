FROM openjdk:8
EXPOSE 8181
ADD target/spring-jenkins.jar spring-jenkins.jar
ENTRYPOINT ["java","-jar","/spring-jenkins.jar"]