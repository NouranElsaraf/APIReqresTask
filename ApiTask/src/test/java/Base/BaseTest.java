package Base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification requestSpec;

    @BeforeClass
    public void setUp() {
        // Configure every request with base URI and logging
        requestSpec = RestAssured.given()
                .baseUri("https://reqres.in/api")
                .log().all();  // Log all requests and responses globally

        // Set globally
        RestAssured.requestSpecification = requestSpec;

    }
}
