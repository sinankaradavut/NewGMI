package gmiBank_team22.StepDefinitions;


import gmiBank_team22.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
public class US_025_CreateCountry_StepDefinitions {



    @Given("user sets the countries to response using api end point {string}")
    public void user_sets_the_countries_to_response_using_api_end_point(String endpoint) {
      Response responseFirst =given().headers("Authorization","Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
         responseFirst.prettyPrint();

    }

    @Given("user sets the countries to response using api end point {string} and creates country using {string} and {string}")
    public void user_sets_the_countries_to_response_using_api_end_point_and_creates_country_using_and(String endpoint, String type, String country) {




            Response response = given().headers("Authorization", "Bearer " + ConfigurationReader.getProperty("token"),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept",
                    ContentType.JSON)
                    .when().body("{\"" + type + "\":\"" + country + "\"}")
                    .post(endpoint)
                    .then()
                    .contentType(ContentType.JSON)
                    .extract()
                    .response();

            //   response.prettyPrint();
        }



    @Then("user validates created new country in all list")
    public void user_validates_created_new_country_in_all_list(String endpoint ) {
        Response responseLast=given().headers("Authorization","Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
         responseLast.prettyPrint();

            JsonPath json = responseLast.jsonPath();

            String id=json.getString("id");

            Assert.assertTrue("not verify",id.contains("62874"));
        }



        }





