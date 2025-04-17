FROM openjdk:17
WORKDIR /app

# 1. 소스 복사 후 gradle 빌드
COPY . .
RUN ./gradlew build

# 2. 빌드된 JAR 복사해서 실행
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
