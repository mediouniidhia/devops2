FROM openjdk:11
EXPOSE 8083
ADD target/auth-0.0.1-SNAPSHOT.jar auth-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","auth-0.0.1-SNAPSHOT.jar"]
