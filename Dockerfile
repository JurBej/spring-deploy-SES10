# Establece la imagen base
FROM openjdk:20-jdk

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación al directorio de trabajo
COPY target/spring-deploy-SES10-1.0.jar app.jar

# Define el comando de inicio del contenedor
CMD ["java", "-jar", "app.jar"]