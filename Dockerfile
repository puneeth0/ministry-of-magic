# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/ministry-of-magic.jar /app/ministry-of-magic.jar

# Expose the application port
EXPOSE 8084

# Command to run the application
CMD ["java", "-jar", "ministry-of-magic.jar"]
