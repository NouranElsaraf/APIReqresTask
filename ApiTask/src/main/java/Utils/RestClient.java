package Utils;

import io.restassured.response.Response;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class RestClient {

    public static Response get(String endpoint, Map<String, Object> queryParams) {
        return given().header("Content-Type", "application/json").queryParams(queryParams).when().get(endpoint);
    }

    public static Response post(String endpoint, String body) {
        return given().header("Content-Type", "application/json").body(body).when().post(endpoint);
    }

    public static Response put(String endpoint, String body) {
        return given().header("Content-Type", "application/json").body(body).when().put(endpoint);
    }
}
