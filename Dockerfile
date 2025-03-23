# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file (Make sure to build your project first)
COPY target/democicd.jar democicd.jar

# Expose the application port
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "democicd.jar"]
