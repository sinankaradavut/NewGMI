package NewGMIBank.StepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojos.Country;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.ReadTxt;
import gmiBank_team22.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_26_Country_Update {

  Response responseAll;
  Country[] country;
    List<Integer>ids=new ArrayList<>();
    List<String>names=new ArrayList<>();

    @Given("user sets all data using {string} using {string} and {string} and {string}")
    public void user_sets_all_data_using_using_and_and(String url, String id, String name, String state) {
  //we update the country by through the id number that is written in the feature file
     Map<String,Object>newCountry=new LinkedHashMap<>();
     newCountry.put("id",id); //id is coming from feature
     newCountry.put("name",name);// name we wrote in the feature file
     newCountry.put("state",state);

     // in this section we already updated the country
        Response response=given().accept(ContentType.JSON).contentType(ContentType.JSON)
     .headers("Authorization","Bearer "+ ConfigurationReader.getProperty("token"))
                .body(newCountry).when().put(url).then().statusCode(200)
                .extract().response();
        response.prettyPrint();



    }

    @Given("user sets the countries to response using {string}")
    public void user_sets_the_countries_to_response_using(String url) {
  //in this section we can see that updated country whether is found or not in the response
    responseAll=given().accept(ContentType.JSON).contentType(ContentType.JSON)
            .headers("Authorization","Bearer "+ ConfigurationReader.getProperty("token"))
            .when().get(url).then().statusCode(200).extract().response();
    responseAll.prettyPrint();

    }

    @Then("user validates updated country")
    public void user_validates_updated_country() {
    //we are checking the updated country
        JsonPath jp=responseAll.jsonPath();
        String name=jp.getString("name");
        Assert.assertTrue("not verified",name.contains("Switzerland"));
    }

    @Then("user saves the countries to correspondent files")
    public void user_saves_the_countries_to_correspondent_files() throws Exception {

        ObjectMapper mapper=new ObjectMapper();
        country=mapper.readValue(responseAll.asString(), Country[].class);

// we retrieve all country and all country id numbers by using object mapper and pojo classes
        for (int i=0; i<=country.length-1; i++){
       ids.add(country[i].getId());
       names.add(country[i].getName());
        }

// this method is used to clean id numbers in the xt file
        File file=new File("countries.id.info.txt");
        if (file!=null)
            file.delete();

//same method.otherwise in everycommand the names will be written again in the txt file.
        file=new File("countries.name.info.txt");
        if (file!=null)
            file.delete();

        //it stores country id numbers in the txt file
        WriteToTxt.saveDataInFileInt("countries.id.info.txt",country);
        // it stores country names in the txt files
      //  WriteToTxt.saveDataInFile("countries.name.info.txt",country);




    }
    @Then("user validates the countries")
    public void user_validates_the_countries() {

        //it reads the id numbers saved in the txt files and copy the ids allInfoId
        List<String>allInfoId= ReadTxt.returnCountryTech("countries.id.info.txt");
       // it reads the country names saved in the txt files and copied the to the allInfoNames
        List<String>allInfoNames= ReadTxt.returnCountryTech("countries.name.info.txt");

        System.out.println("===================");


        //the all id numbers that we retrieve from database
        System.out.println(ids);
        //the id numbers that we saved in the allInfold from txt files
        System.out.println(allInfoId);
        System.out.println("===================================================");
        //the all country names we retrieve from database
        System.out.println(names);
       //the all country names we saved from txt files
        System.out.println(allInfoNames);
       //the all id numbers that we will check the the id numbers located in the txt file
        System.out.println(ids.size());
      // the all id numbers saved in the txt file that we will check it with local id numbers
        System.out.println(allInfoId.size());
     // the country names saved in the txt files we will find the size and check local name size
        System.out.println(allInfoNames.size());
     //this is the local country name size that we will check it the names in the txt file
        System.out.println(names.size());

        String actaul=ids.toString();
        String expected=allInfoId.toString();

    //actual is the id numbers from local, expected is the id numbers from txt file
        Assert.assertEquals("hh",actaul,expected);


        String actualNames=names.toString();
        String expectedNames=allInfoNames.toString();
//actual country name from local, expected country name is from txt file
        Assert.assertEquals("not verified",actualNames,expectedNames);


    }

}
