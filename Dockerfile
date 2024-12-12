# Use an official OpenJDK 17 image as the base
FROM eclipse-temurin:17.0.13_11-jdk-alpine
EXPOSE 8088
ADD build/libs/mini-kube.jar mini-kube.jar
ENTRYPOINT ["java", "-jar", "/mini-kube.jar"]