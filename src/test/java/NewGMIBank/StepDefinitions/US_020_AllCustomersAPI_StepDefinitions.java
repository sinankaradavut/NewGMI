package NewGMIBank.StepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojos.Customer;
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
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_020_AllCustomersAPI_StepDefinitions {
     Response response;
     ObjectMapper object ;
     JsonPath json;
     Customer[] customers;
    List<Map<String,Object>>allCustomersData;

    @Given("use the api endpoint {string}")
    public void use_the_api_endpoint(String endPointUrl) {
     response= given()
             .accept(ContentType.JSON)
             .auth().oauth2(ConfigurationReader.getProperty("token"))
             .when()
             .get(endPointUrl);
      response
              //.prettyPeek()
              .then()
              .statusCode(200);
        json=response.jsonPath();

    }

    @Then("get all customers' information as de-serialization")
    public void get_all_customers_information_as_de_serialization() throws Exception {


        allCustomersData= json.getList("$");
        System.out.println("allCustomersData = " + allCustomersData);
        System.out.println("First customer's first name:  " + allCustomersData.get(0).get("firstName"));
        System.out.println("First customer's last name:  " + allCustomersData.get(0).get("lastName"));
        }


    @Then("write the all customer's {string} and  {string} in a  file")
    public void writeTheAllCustAndInAFile(String firstName, String lastName) throws Exception {
        object = new ObjectMapper();
        customers = object.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Customer's first name: " + customers[i].getFirstName());
            System.out.println("Customer's last name: " + customers[i].getLastName());
        }
        File file= new File("AllCustomerInfo.csv");
        if(file != null){
            file.delete();
        }
        WriteToTxt.saveDataInFileFirstNameLastName("AllCustomerInfo.csv", customers);

    }


    @Then("write the all customer's {string} in a file and validate all the {string}")
    public void writeTheAllCustomerSInAFileAndValidateAllThe(String SSN, String ssn) throws Exception{
        List<String> allSSN = new ArrayList<>();
        object = new ObjectMapper();
        customers = object.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            allSSN.add(customers[i].getSsn());
        }
        System.out.println(allSSN);
        File file= new File("allCustomerSsn.txt");
        if(file != null){
            file.delete();
        }

        WriteToTxt.saveDataInFile("allCustomerSsn.txt", customers);
        List<String> customerSSNList = ReadTxt.returnCustomerSNNList("allCustomerSsn.txt");

        Assert.assertEquals(" Customers' ssn not matched with the data",customerSSNList,allSSN);
        System.out.println("Data validation has been successful");
    }


        @Then("verify that first customer's city {string} and zipCode {string}")
        public void verify_that_first_customer_s_city_and_zipCode (String city, String zipCode){

            String actualCity=allCustomersData.get(0).get("city").toString();
            System.out.println(actualCity);
            String actualZipCode=allCustomersData.get(0).get("zipCode").toString();
            Assert.assertEquals("Not matched the city",city,actualCity);
            Assert.assertEquals("Not matched the zipCode",zipCode,actualZipCode);

        }

        @Then("verify that third customer's firstName {string} and lastName {string}")
        public void verify_that_third_customer_s_firstName_and_lastName (String firstName, String lastName){

        String actualFirstName=allCustomersData.get(2).get("firstName").toString();
        String actualLastName= allCustomersData.get(2).get("lastName").toString();
        Assert.assertEquals("Not matched the first name",firstName,actualFirstName);
        Assert.assertEquals("Not matched the last name",lastName,actualLastName);

        }

        @Then("verify that last customer's firstName {string} and lastName {string}")
        public void verify_that_last_customer_s_firstName_and_lastName (String firstName, String lastName){
            String actualFirstName=allCustomersData.get(allCustomersData.size()-1).get("firstName").toString();
            String actualLastName=allCustomersData.get(allCustomersData.size()-1).get("lastName").toString();
            Assert.assertEquals("Not matched the first name",firstName,actualFirstName);
            Assert.assertEquals("Not matched the last name",lastName,actualLastName);
        }

        @Then("verify the number {int} that is equals to the customers'number created from user")
        public void verifyTheNumberThatIsEqualsToTheCustomersNumberCreatedFromUser ( int totalNumberOfCustomer){
        int actualTotalNumberOfCustomers= allCustomersData.size();
        Assert.assertEquals("Total number of customers did mot match",totalNumberOfCustomer,actualTotalNumberOfCustomers);
        }

        @Then("verify that first customer's email {string} and mobilePhoneNumber {string}")
        public void verifyThatFirstCustomerSEmailAndMobilePhoneNumber (String email, String mobilePhoneNumber){
            String actualEmail= allCustomersData.get(0).get("email").toString();
            String actualmobilePhoneNumber=allCustomersData.get(0).get("mobilePhoneNumber").toString();
            Assert.assertEquals("Not matched the email",email,actualEmail);
            Assert.assertEquals("Not matched the mobile phone number",mobilePhoneNumber,actualmobilePhoneNumber);


        }



}





