FROM maven

WORKDIR /src

COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

CMD ["java", "-jar", "target/tp-lassaad-0.0.1-SNAPSHOT.jar"]