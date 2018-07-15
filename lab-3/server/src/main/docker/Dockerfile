FROM openjdk:8-jre
MAINTAINER Koby Aharon <kobyahron@gmail.com>

COPY maven/ /opt/pta/listener/lib
ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/pta/listener/lib/@project.build.finalName@.jar"]

EXPOSE 8001