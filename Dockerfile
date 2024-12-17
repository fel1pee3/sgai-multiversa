# Usa uma imagem base do Java 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado pelo Spring Boot para o container
COPY target/sgai-multiversa-1.0.0.jar app.jar

# Expõe a porta na qual a aplicação Spring Boot será executada
EXPOSE 8080

# Define o comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
