FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  test-server-1.0-SNAPSHOT.jar test-server.jar
ENTRYPOINT ["java","-Xmx1024m","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=GMT+08","-jar","/test-server.jar"]