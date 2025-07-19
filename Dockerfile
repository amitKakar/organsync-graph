FROM openjdk:21-jdk-slim
COPY target/organsync-graph-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
