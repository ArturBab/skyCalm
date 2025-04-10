# SkyCalm Analyzer — gRPC Microservice

`skycalm-analyzer` is a backend gRPC microservice, part of the SkyCalm architecture.  
It is designed to analyze flight routes and provide comfort-focused data such as turbulence and weather predictions for people with aerophobia.

---

## Technologies Used

- Java 17
- Spring Boot 3.4.4
- gRPC with `grpc-spring-boot-starter`
- Protobuf
- Maven
- OS-independent build via Maven Wrapper

---

## How to Run Locally

> ⚠️ Java 17 is required  
> Make sure you have Git and a terminal with Maven wrapper support.

### 1. Clone the repo

```bash
git clone https://github.com/ArturBab/skyCalm.git
cd skyCalm/skycalm-analyzer
```

### 2. Build project

```bash
./mvnw clean compile
```

This step also auto-generates gRPC classes from `src/main/proto/FlightAnalyzer.proto`.

### 3. Run the gRPC server

```bash
./mvnw spring-boot:run
```

If successful, you’ll see:

```
gRPC Server started, listening on address: *, port: 9090
```

---

## Project Structure

```
skycalm-analyzer/
│
├── src/
│   ├── main/
│   │   ├── java/com/skycalm/analyzer/
│   │   │   ├── SkycalmAnalyzerApplication.java  ← main class
│   │   │   └── service/FlightAnalyzerServiceImpl.java ← gRPC logic
│   │   └── proto/FlightAnalyzer.proto ← protobuf contract
│   └── resources/
│
├── target/ ← contains compiled code + generated gRPC files
├── pom.xml
```

---

## gRPC Integration Notes

To successfully run the gRPC server in this module, the following configuration is critical:

### Required Dependencies (Maven)

```xml
<dependency>
    <groupId>net.devh</groupId>
    <artifactId>grpc-server-spring-boot-starter</artifactId>
    <version>2.15.0.RELEASE</version>
</dependency>

<dependency>
    <groupId>net.devh</groupId>
    <artifactId>grpc-client-spring-boot-starter</artifactId>
    <version>2.15.0.RELEASE</version>
</dependency>

<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
```

### Required Protobuf Plugin

```xml
<plugin>
    <groupId>org.xolstice.maven.plugins</groupId>
    <artifactId>protobuf-maven-plugin</artifactId>
    <version>0.6.1</version>
    <configuration>
        <protocArtifact>com.google.protobuf:protoc:3.21.12:exe:${os.detected.classifier}</protocArtifact>
        <pluginId>grpc-java</pluginId>
        <pluginArtifact>io.grpc:protoc-gen-grpc-java:1.59.0:exe:${os.detected.classifier}</pluginArtifact>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>compile</goal>
                <goal>compile-custom</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

Include also:

```xml
<extensions>
    <extension>
        <groupId>kr.motd.maven</groupId>
        <artifactId>os-maven-plugin</artifactId>
        <version>1.7.0</version>
    </extension>
</extensions>
```

---

## Test the gRPC Server

Use any gRPC client (e.g. BloomRPC, Postman, or grpcurl)  
to send a request to:

```
localhost:9090
service: flightanalyzer.FlightAnalyzerService
method: AnalyzeFlight
```

Sample request:

```json
{
  "flightNumber": "SK123",
  "departureDate": "2025-04-01"
}
```

---

## Common Issues & Fixes (SkyCalm gRPC Troubleshooting Guide)

> These are real issues encountered and fixed during SkyCalm Analyzer development.

### 1. "Unable to find a suitable main class"

Fix: Add `<mainClass>` to `spring-boot-maven-plugin`  
Avoid overriding `<sourceDirectory>`

### 2. "ClassNotFoundException: SkycalmAnalyzerApplication"

Fix: Ensure correct `<sourceDirectory>` and recompile with `./mvnw clean compile`

### 3. "Cannot inherit from final class FlightAnalyzerServiceGrpc"

Fix: Extend `FlightAnalyzerServiceGrpc.FlightAnalyzerServiceImplBase`

### 4. "The version cannot be empty" (for spring-boot-configuration-processor)

Fix: Replace `${spring-boot.version}` with hardcoded `3.4.4`

---

## Author

Built by **Artur Bab**  
This service is a part of the SkyCalm project — calming the skies for nervous flyers
