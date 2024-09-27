package Utils;

public class EndPoints {

    // List Users endpoint with dynamic page number
    public static String listUsers(int page) {
        return "/users?page=" + page;
    }

    // Other static endpoints
    public static final String CREATE_USER = "/users";
    public static final String UPDATE_USER = "/users/2";
}
