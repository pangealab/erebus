FROM openjdk:8-jdk-alpine

ARG IMAGE_CREATE_DATE
ARG IMAGE_VERSION
ARG IMAGE_SOURCE_REVISION

# Metadata as defined in OCI image spec annotations - https://github.com/opencontainers/image-spec/blob/master/annotations.md
LABEL org.opencontainers.image.title="Erebus" \
      org.opencontainers.image.description="Cat/City of the Day (COTD) example Java Spring Boot 2.2 REST Web Service Application for Kubernetes" \
      org.opencontainers.image.created=$IMAGE_CREATE_DATE \
      org.opencontainers.image.version=$IMAGE_VERSION \
      org.opencontainers.image.authors="Anthony Angelo" \
      org.opencontainers.image.url="https://github.com/pangealab/erebus/" \
      org.opencontainers.image.documentation="https://github.com/pangealab/erebus/README.md" \
      org.opencontainers.image.vendor="Anthony Angelo" \
      org.opencontainers.image.licenses="MIT" \
      org.opencontainers.image.source="https://github.com/pangealab/erebus.git" \
      org.opencontainers.image.revision=$IMAGE_SOURCE_REVISION 

# Declare Ports
EXPOSE 8080

# Copy App
ADD target/app.jar app.jar

# Run Spring Boot
ENTRYPOINT ["java","-jar","/app.jar"]

# CMD ["catalina.sh", "run"]