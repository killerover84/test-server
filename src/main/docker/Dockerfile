FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  gas-server-1.0-SNAPSHOT.jar gas-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=GMT+08","-jar","/gas-server.jar"]