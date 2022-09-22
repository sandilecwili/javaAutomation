import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetRequest {

    @Test
    void test1(){
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/12");
        System.out.println("response"+response.asString());
        System.out.println("status"+response.getStatusCode());
        System.out.println("body"+response.getBody().asString());

        given()
            .when()
                .get("https://petstore.swagger.io/v2/pet/12")
            .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("id", equalTo(12))
                .header("Content-Type","application/json");

    }
}
