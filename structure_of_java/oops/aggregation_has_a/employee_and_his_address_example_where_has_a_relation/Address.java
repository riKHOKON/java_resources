package structure_of_java.oops.aggregation_has_a.employee_and_his_address_example_where_has_a_relation;

/**
 * Created by ri on 2/11/17.
 */
public class Address {
    private String city,
            state,
            country;
    public Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
}
