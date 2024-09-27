package Utils;

import java.util.HashMap;
import java.util.Map;

public class QueryParameters {

    // Method to create query parameters for different scenarios
    public static Map<String, Object> listUsersQueryParams(int page) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("page", page);
        return queryParams;
    }

    // You can add more methods here for different query parameters if needed
}
