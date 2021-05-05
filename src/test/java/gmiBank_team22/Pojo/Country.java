package gmiBank_team22.Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    private int id;
    private String name;
    private Object states;


    public Country(String name) {
        this.name = name;
    }
    public Country(String name, Object states) {
        this.name = name;
        this.states = states;
    }

    public Country() {

    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return name;
    }
    public void setState(String state) {
        this.states = state;
    }
}
