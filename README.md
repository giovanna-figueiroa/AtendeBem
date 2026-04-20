# AtendeBem 💻👩‍⚕️

AtendeBem is a patient triage API that organizes a medical queue based on urgency, pain level, and special patient conditions.

## 💻 Technologies

- Java 17
- Spring Boot 3.2.5
- Maven
- JUnit 5

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher installed
- Maven installed or available via full path
- A terminal or IDE capable of running Maven projects

### Run the application

From the project root:

```powershell
cd "C:\Users\Infra\OneDrive\Documentos\dev life\JAVA\java-poo-curso-em-video\AtendeBem"
& 'C:\Program Files\apache-maven-3.9.15\bin\mvn.cmd' spring-boot:run
```

If `mvn` is configured in your PATH, you can also use:

```powershell
mvn spring-boot:run
```

The application is configured to run on port `9090`.

### Build and test

```powershell
mvn clean package
mvn test
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
  "symptoms": "Stomach pain",
  "painLevel": 7,
  "specialCondition": "GRAVE"
}
```

### Get the patient queue

`GET /api/pacientes/fila`

Returns the current queue of patients ordered by priority.

## 📌 Notes

- The service stores patients in memory for demonstration purposes.
- Priority is determined by a simple rule set and special condition categories.
- The project includes input validation and error handling for request data.

## 🔧 Available features

- Patient registration endpoint
- Priority-based queue ordering
- Request validation using Jakarta Validation
- Standardized API error responses
- Unit tests for triage logic

## 🧪 Testing with Postman or curl

After starting the app, test the queue endpoint:

```bash
curl http://localhost:9090/api/pacientes/fila
```

To register a patient:

```bash
curl -X POST http://localhost:9090/api/pacientes \
  -H "Content-Type: application/json" \
  -d '{"fullName":"João Silva","address":"Rua A, 123","rg":"12345678","age":30,"symptoms":"Headache","painLevel":5,"specialCondition":"NORMAL"}'
```

## 📁 Project structure

- `src/main/java` - application source code
- `src/main/resources` - application configuration files
- `src/test/java` - unit tests
- `pom.xml` - Maven build configuration

---

If you want, I can also update the API route paths to English-based URLs like `/api/triage` and `/api/triage/queue`.


