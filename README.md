
<h1 align="center" style="font-weight: bold;">AtendeBem 💻👩‍⚕️</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
 <a href="#api">API</a>
</p>

<p align="center">
    <b>AtendeBem é uma API de triagem de pacientes que organiza uma fila de atendimento por prioridade com base em critérios de urgência médica, dor e condições especiais.</b>
</p>

<h2 id="tech">💻 Technologies</h2>

- Java 17
- Spring Boot 3
- Maven
- JUnit 5

<h2 id="started">🚀 Getting Started</h2>

<h3>Prerequisites</h3>

- Java 17 ou superior instalado
- Maven instalado
- Um terminal ou IDE compatível

<h3>Run the application</h3>

```bash
cd "C:\Users\Infra\OneDrive\Documentos\dev life\JAVA\java-poo-curso-em-video\AtendeBem"
mvn spring-boot:run
```

<h3>Build and test</h3>

```bash
mvn clean package
mvn test
```

<h2 id="api">📡 API Endpoints</h2>

- `POST /api/pacientes`
  - Registra um paciente e calcula sua prioridade.
  - Exemplo de payload:

```json
{
  "fullName": "Maria Silva",
  "address": "Rua das Flores, 123",
  "rg": "12345678",
  "age": 32,
  "symptoms": "Dor abdominal",
  "painLevel": 7,
  "specialCondition": "Gestante"
}
```

- `GET /api/pacientes/fila`
  - Retorna a fila de pacientes ordenada por prioridade.

<h2 id="notes">📝 Notes</h2>

- O serviço mantém os pacientes em memória para demonstração.
- A prioridade utiliza regras simples e uma classificação de 1 a 5.
- O projeto já inclui validação de entrada e tratamento de erros de requisição.


