# Use official OpenJDK runtime as base image
FROM openjdk:17-jdk-slim

# Set maintainer label
LABEL maintainer="your-email@example.com"

# Set working directory inside container
WORKDIR /app

# Create a non-root user to run the application
RUN addgroup --system javagroup && adduser --system --ingroup javagroup javauser

# Copy the JAR file from target directory
COPY target/*.jar app.jar

# Create directory for application logs
RUN mkdir -p /app/logs && chown javauser:javagroup /app/logs

# Switch to non-root user
USER javauser

# Expose the port the app runs on
EXPOSE 8080

# Add health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s --retries=3 \
    CMD curl -f http://localhost:8080/actuator/health || exit 1

# Set JVM options for better container performance
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0 -Djava.security.egd=file:/dev/./urandom"

# Run the application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]