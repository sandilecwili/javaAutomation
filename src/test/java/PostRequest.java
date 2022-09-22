import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {

    public static HashMap map=new HashMap();

    @BeforeClass
    public void postdata(){
        map.put("name",Rest.petName());
        map.put("status",Rest.petStatus());
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";

    }

    @Test
    public void testPost(){

        given()
            .contentType("application/json")
            .body(map)
        .when()
            .post()
        .then()
            .statusCode(200)
            .and()
            .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
            .body("Message",equalTo("The pet has been added"));
    }
}
