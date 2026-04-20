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
  "specialCondition": "Deficiente"
}
```

### Get the patient queue

`GET /api/pacientes/fila`

This endpoint returns the current list of registered patients ordered by priority.


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


