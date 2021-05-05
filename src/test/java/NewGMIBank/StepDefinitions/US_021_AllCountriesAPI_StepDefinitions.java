package NewGMIBank.StepDefinitions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojos.Country;
import gmiBank_team22.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class US_021_AllCountriesAPI_StepDefinitions {


    Response response;
    JsonPath json;
    static List<Map<String, Object>> allCountriesData;
    Country[] country;
    static int size;

    @Given("read all countries info using api end point {string}")
    public void read_all_countries_info_using_api_end_point(String string) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(string);
    }


    @Then("get all countries")
    public void get_all_countries() throws JsonProcessingException {

        ObjectMapper obj = new ObjectMapper();
        country = obj.readValue(response.asString(), Country[].class);
        // System.out.println(allCountriesData);
        for(int i=0; i<country.length; i++) {
            if(country[i].getName()!=null){
                System.out.println(country[i].getName().toString());
            }
        }

    }

    @Then("assert all countries")
    public void assert_all_countries() {
        Assert.assertNotNull(allCountriesData);
    }

    @Then("assert countries one by one:")
    public void assert_countries_one_by_one(List<String> expectedCountries) {

        List<String> actual= new ArrayList<String>();

        for(int i=0; i<=4; i++){
            if(allCountriesData.get(i).get("name")!=null)
            actual.add(allCountriesData.get(i).get("name").toString());
        }



        System.out.println("actual" + actual);
        System.out.println("expected" +expectedCountries);
        Assert.assertEquals(actual,expectedCountries);
        //Assert.assertTrue(actual.contains(expectedCountries));

    }

}





























//        //read first countries data => {id=22312, name=new zeland, states=null}
//        System.out.println(allCountriesData.get(0));
//
//        //read 5th country id=> 18948
//        System.out.println(allCountriesData.get(4).get("id"));
//        Integer expectedId = (int) allCountriesData.get(4).get("id");
//
//        //read 8th country name => Dominic
//        System.out.println(allCountriesData.get(7).get("name"));
//        String expectedCountryName= allCountriesData.get(7).get("name").toString();
//
//        //read 3rd country state => null
//        System.out.println(allCountriesData.get(2).get("states"));
//        String expected3rdCountryState= (String) allCountriesData.get(2).get("states");
//
//        //read last country name => Cindy
//        System.out.println(allCountriesData.get(allCountriesData.size()-1).get("name"));
//        String expectedLastCountryName= allCountriesData.get(allCountriesData.size()-1).get("name").toString();
//
//
//        // WriteToTxt.saveAllStates("allCountries.csv", allCountriesData );
//
//
//
//
//
//
//
//    }
