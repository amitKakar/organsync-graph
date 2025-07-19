# OrganSync Graph Service

## How to Run

1. Build and run infrastructure:
   ./build.sh

2. Access API:
   http://localhost:8085/graph/api/v1/graph/stats

3. H2 Console:
   http://localhost:8085/h2-console

## Features

- Real-time compatibility graph
- Event-driven updates via Kafka
- Advanced compatibility scoring with JGraphT
- API exposure for stats, analysis, and more

## Requirements

- Java 21+
- Maven 3.8+
- Docker (for compose/kafka/postgres)
