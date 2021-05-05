package NewGMIBank.StepDefinitions;

import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.DataBaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_029_DataBase_Step_Def {

    String userDataQuery = "SELECT * FROM " + ConfigurationReader.getProperty("usersTableName");
    ResultSet resultSetUser;
    List<String> userFirstName = new ArrayList<>();

    ResultSet resultSetCountry;
    String countriesDataQuery = "SELECT *  FROM " + ConfigurationReader.getProperty("countriesTableName");
    List<String> countryList = new ArrayList<>();

    ResultSet resultSetStates;
    String statesDataQuery = "SELECT * FROM " + ConfigurationReader.getProperty("statesTableName");
    List<String> statesList = new ArrayList<>();



    @Given("user  connecting GMI database")
    public void user_connecting_GMI_database() {
        resultSetUser = DataBaseUtility.getResultSet(userDataQuery);
        resultSetCountry = DataBaseUtility.getResultSet(countriesDataQuery);
        resultSetStates = DataBaseUtility.getResultSet(statesDataQuery);

    }


    @Given("user read all user data from database")
    public void user_read_all_user_data_from_database() throws SQLException {
        ResultSetMetaData userMetaData = resultSetUser.getMetaData();
        int columnCount = userMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSetUser.next()) {
            String firstname = resultSetUser.getString("first_name");
            userFirstName.add(firstname);
        }

        System.out.println(userFirstName);

    }

    @Then("user validate all user data")
    public void user_validate_all_user_data() throws SQLException {
        String userFirstnameQuery = "SELECT first_name FROM " + ConfigurationReader.getProperty("usersTableName");
        resultSetUser = DataBaseUtility.getResultSet(userFirstnameQuery);
        List<String> actualFirstName = new ArrayList<>();

        while (resultSetUser.next()) {
            String firstname = resultSetUser.getString("first_name");
            actualFirstName.add(firstname);
        }

        Assert.assertEquals(userFirstName,actualFirstName);

    }


    @Given("user read all countries infos from database")
    public void user_read_all_countries_infos_from_database() throws SQLException {
        ResultSetMetaData countryMetaData = resultSetCountry.getMetaData();
        int columnCount = countryMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(countryMetaData.getColumnName(i));
        }

        while (resultSetCountry.next()) {
            String country = resultSetCountry.getString("name");
            countryList.add(country);
        }

        System.out.println(countryList);

    }

    @Then("user validate all countries infos")
    public void user_validate_all_countries_infos() throws SQLException {
        String countryNameQuery = "SELECT name FROM " + ConfigurationReader.getProperty("countriesTableName");
        resultSetCountry = DataBaseUtility.getResultSet(countryNameQuery);
        List<String> actualCountry = new ArrayList<>();

        while (resultSetCountry.next()) {
            String firstname = resultSetCountry.getString("name");
            actualCountry.add(firstname);
        }

        Assert.assertEquals(countryList,actualCountry);

    }


    @Given("user read all states of related to USA from database")
    public void user_read_all_states_of_related_to_USA_from_database() throws SQLException {
        ResultSetMetaData statesMetaData = resultSetStates.getMetaData();
        int columnCount = statesMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(statesMetaData.getColumnName(i));
        }

        String statesDataQuery = "SELECT * FROM public.tp_state WHERE name  = 'Washington' ";
        resultSetStates = DataBaseUtility.getResultSet(statesDataQuery);

        while (resultSetStates.next()) {
            String states = resultSetStates.getString("name");
            statesList.add(states);
        }

        System.out.println(statesList);

    }

    @Then("user")
    public void user() throws SQLException {
        String statesDataQuery = "SELECT * FROM public.tp_state";
        resultSetStates = DataBaseUtility.getResultSet(statesDataQuery);
        List<String> allStatesList = new ArrayList<>();


        while (resultSetStates.next()) {
            String states = resultSetStates.getString("name");
            allStatesList.add(states);
        }

        Assert.assertTrue(allStatesList.containsAll(statesList));
    }

    }


