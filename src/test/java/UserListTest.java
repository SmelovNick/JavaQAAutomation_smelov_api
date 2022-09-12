import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class UserListTest {
    final String URL = "https://gorest.co.in/public/v2/users";

    @Test
    public void arrayListIsNotEmpty(){
        RestAssured
                .given().log().all()
                .when().log().all()
                    .get(URL)
                .then().log().all();
    }
}
