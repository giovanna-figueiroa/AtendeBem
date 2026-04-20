# AtendeBem 💻👩‍⚕️

AtendeBem is a patient triage API that organizes a medical queue by priority using basic urgency rules, pain level, and special patient conditions.

## 💻 Technologies

- Java 17
- Spring Boot 3.2.5
- Maven
- JUnit 5

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher installed
- Maven installed, or use the included Maven wrapper
- A terminal or IDE that supports Java and Maven projects

### Run the application

From the project root directory:

#### Linux / macOS

```bash
./mvnw spring-boot:run
```

#### Windows

```powershell
mvnw.cmd spring-boot:run
```

If you have Maven installed and available in your PATH, you can also run:

```bash
mvn spring-boot:run
```

The application starts on port `9090` by default.

### Build and test

#### Linux / macOS

```bash
./mvnw clean package
./mvnw test
```

#### Windows

```powershell
mvnw.cmd clean package
mvnw.cmd test
```

## 📡 API Endpoints

### Register a patient

`POST /api/pacientes`

Request body example:

```json
{
  "fullName": "Maria Silva",
  "address": "Rua das Flores, 123",
  "rg": "12345678",
  "age": 32,
  "symptoms": "Abdominal pain",
  "painLevel": 7,
  "specialCondition": "GRAVE"
}
```

### Get the patient queue

`GET /api/pacientes/fila`

This endpoint returns the current list of registered patients ordered by priority.

## 🧪 Example curl requests

Retrieve the queue:

```bash
curl http://localhost:9090/api/pacientes/fila
```

Register a patient:

```bash
curl -X POST http://localhost:9090/api/pacientes \
  -H "Content-Type: application/json" \
  -d '{
    "fullName": "João Silva",
    "address": "Rua A, 123",
    "rg": "12345678",
    "age": 30,
    "symptoms": "Headache",
    "painLevel": 5,
    "specialCondition": "NORMAL"
  }'
```

## 📌 Notes

- The application stores patients in memory only, so data is reset each time the server restarts.
- Priority is calculated with simple rules and category weights.
- Input validation is enforced for required fields and numeric ranges.
- Error responses are returned in a JSON format.

## 📁 Project structure

- `src/main/java` - application source code
- `src/main/resources` - configuration and resource files
- `src/test/java` - unit test cases
- `pom.xml` - Maven project configuration
- `mvnw`, `mvnw.cmd`, and `.mvn/` - Maven wrapper files for portability

## 💡 Public repository notes

This README is intended for any user cloning this repository. It uses the Maven wrapper so users do not need a globally installed Maven version.

---

If you want, I can also update the API paths to English route names like `/api/triage` and `/api/triage/queue`.


