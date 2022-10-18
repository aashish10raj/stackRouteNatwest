FROM openjdk:11
EXPOSE 8083
COPY target/UserProfileService-0.0.1-SNAPSHOT.jar user-profile-service-0.0.1.jar
ARG JAR_FILE=target/UserProfileService-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} user-profile-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/user-profile-service-0.0.1.jar"]