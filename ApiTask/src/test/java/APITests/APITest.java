package APITests;

import Base.BaseTest;
import Utils.EndPoints;
import Utils.QueryParameters;
import Utils.RestClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Map;

import static Utils.EndPoints.*;

public class APITest extends BaseTest {
    
    @Test
    public void listUsersTest() {
        int page = 2;
        Map<String, Object> queryParams = QueryParameters.listUsersQueryParams(page);
        Response response = RestClient.get(listUsers(page), queryParams);

        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");
        Assert.assertNotNull(response.jsonPath().getList("data"), "User data list is empty!");
    }

    @Test
    public void createUserTest() {
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"leader\" }";
        Response response = RestClient.post(CREATE_USER, requestBody);

        Assert.assertEquals(response.getStatusCode(), 201, "Failed to create user!");
        Assert.assertEquals(response.jsonPath().get("name"), "morpheus", "Name mismatch!");
        Assert.assertEquals(response.jsonPath().get("job"), "leader", "Job mismatch!");
    }

    @Test
    public void updateUserTest() {
        String requestBody = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";
        Response response = RestClient.put(UPDATE_USER, requestBody);

        Assert.assertEquals(response.getStatusCode(), 200, "Failed to update user!");
        Assert.assertEquals(response.jsonPath().get("job"), "zion resident", "Job update failed!");
    }
}
