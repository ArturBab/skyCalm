# **SkyCalm — Calm Your Flight, Calm Your Mind**

**SkyCalm** is a backend-only microservice architecture built in Java using Spring Boot and gRPC.  
It is designed to help people with **aerophobia** (fear of flying) by analyzing flight paths, weather conditions, and turbulence risks to provide detailed, personalized flight comfort information.

---

## Project Goals

- Deliver a real-world microservices backend architecture using Java, Spring Boot, and gRPC
- Integrate external aviation and weather APIs for live analysis
- Demonstrate clean code practices, layered architecture, and service-to-service communication
- Serve as a solid portfolio project for backend development positions

## Tech Stack

| Component        | Technology                        |
|------------------|------------------------------------|
| Language         | Java 17                            |
| Build Tool       | Maven                              |
| Framework        | Spring Boot                        |
| Communication    | REST (Spring MVC) + gRPC           |
| Protocol Format  | Protobuf                           |
| External APIs    | AviationStack, WeatherAPI, etc.    |
| Packaging        | Docker (planned)                   |
| Version Control  | Git + GitHub                       |

---
## Architecture Overview

skyCalm/ ├── skycalm-gateway // Exposes REST API to clients └── skycalm-analyzer // Handles flight/turbulence analysis via gRPC

- `skycalm-gateway`: receives HTTP requests, forwards them to `skycalm-analyzer` via gRPC
- `skycalm-analyzer`: fetches flight data, weather conditions, turbulence zones, and returns flight comfort analysis

---

## Features (In Progress)

- [x] RESTful entrypoint (`skycalm-gateway`)
- [ ] gRPC microservice for analysis (`skycalm-analyzer`)
- [ ] Protobuf-based contract definition
- [ ] Integration with real external APIs
- [ ] Docker + Docker Compose support
- [ ] Flight comfort scoring system

---
## Getting Started

### 1. Run gateway service

```bash
cd skycalm-gateway
./mvnw spring-boot:run     # For Linux/macOS
.\mvnw.cmd spring-boot:run # For Windows
```
---

## **Analyzer service will be connected via gRPC (coming soon)**

* People who experience anxiety before or during flights

* Travel agencies or airline platforms seeking pre-flight reassurance modules

* Developers looking to understand gRPC + REST microservices with Spring Boot
---
### **Author**
ArturBab  — Java Backend Developer
- Graduate of Bauman Moscow State Technical University
 * Focused on backend engineering, clean architecture, and real-world systems