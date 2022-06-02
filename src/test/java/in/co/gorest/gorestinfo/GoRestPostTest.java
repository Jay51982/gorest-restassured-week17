package in.co.gorest.gorestinfo;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoRestPostTest extends TestBase {

    @Test
    public void createUserTest() {

        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna");
        goRestPojo.setGender("male");
        goRestPojo.setEmail("tenali.ramakrishna85@15ce.com");
        goRestPojo.setStatus("active");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 9f5b916fb0e39dcb29461fb21b3157255211935aa46904aa2c4f3ae06118fc6d")
                .body(goRestPojo)
                .when()
                .post();
       response.prettyPrint();
       response.then().statusCode(201);
  }
}
