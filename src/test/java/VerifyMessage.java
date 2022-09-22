import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VerifyMessage {

    @Test(priority = 1)
    void testMessage(){
        given()
                .when()
                .get("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .body("RestResponse.result",equalTo("Message"));

    }

}
