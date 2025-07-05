# Use an official JDK image
FROM openjdk:17-jdk-slim

# Add a label (optional)
LABEL maintainer="your-email@example.com"

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/*.jar app.jar

# Expose port (the one your Spring Boot app runs on)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
