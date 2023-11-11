FROM maven:3.8.5-openjdk-17 AS builder

# Establece el directorio de trabajo en la raíz del proyecto
WORKDIR /usr/src/app

# Copia el archivo pom.xml y las fuentes al directorio de trabajo
COPY pom.xml .
COPY src ./src

# Ejecuta el comando clean e install de Maven
RUN mvn clean install -DskipTests

# Segunda etapa de la construcción de la imagen
FROM openjdk:17.0.1-jdk-slim

# Copia el archivo WAR generado durante la primera etapa
COPY --from=builder /usr/src/app/target/ClothingFashion-0.0.1-SNAPSHOT.war /app/ClothingFashion-0.0.1-SNAPSHOT.war

# Define el puerto en el que se ejecutará la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/ClothingFashion-0.0.1-SNAPSHOT.war"]
