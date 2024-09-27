# API Automation Project

### Prerequisites:
- Java 7 or higher
- Maven 3.6+
- IDE (e.g., IntelliJ IDEA, Eclipse)

### How to run the tests:
1. Clone the repository.
2. Open the project in your preferred IDE.
3. Run the `testng.xml` file to execute the API tests.

### Framework Details:
- The project is based on the RestAssured framework.
- TestNG is used for test execution and assertions.
- Maven is used for dependency management.

### API Endpoints Tested:
- List Users (GET) - https://reqres.in/api/users?page=2
- Create User (POST) - https://reqres.in/api/users
- Update User (PUT) - https://reqres.in/api/users/2

Test reports will be generated in the `test-output` directory after execution.
