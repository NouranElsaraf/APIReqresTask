package Utils;

import io.restassured.response.Response;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class RestClient {

    // GET request with query parameters
    public static Response get(String endpoint, Map<String, Object> queryParams) {
        return given().header("Content-Type", "application/json").queryParams(queryParams).when().get(endpoint);
    }

    // Generic method to send a POST request with a body
    public static Response post(String endpoint, String body) {
        return given().header("Content-Type", "application/json").body(body).when().post(endpoint);
    }

    // Generic method to send a PUT request with a body
    public static Response put(String endpoint, String body) {
        return given().header("Content-Type", "application/json").body(body).when().put(endpoint);
    }
}
