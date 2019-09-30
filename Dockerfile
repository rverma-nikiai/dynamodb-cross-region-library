FROM gcr.io/distroless/java:8
WORKDIR /opt
COPY target/dynamodb-cross-region-replication-1.4.0.jar app.jar
ENTRYPOINT ["/usr/bin/java", "-jar","app.jar"]
