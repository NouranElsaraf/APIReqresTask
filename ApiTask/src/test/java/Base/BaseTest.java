package Base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification requestSpec;

    @BeforeClass
    public void setUp() {
        requestSpec = RestAssured.given()
                .baseUri("https://reqres.in/api")
                .log().all();  // Log all requests and responses

        // Set global
        RestAssured.requestSpecification = requestSpec;

    }
}
