# Dùng image OpenJDK 17
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc
WORKDIR /app

# Copy file jar đã build từ target/
COPY target/taskmanager-be-0.0.1-SNAPSHOT.jar app.jar

# Cấu hình cổng cho container
EXPOSE 8080

# Lệnh chạy Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
