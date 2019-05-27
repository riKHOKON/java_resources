package a_simple_mobile_phone_app.com;

/**
 * Created by RI on 6/12/2017.
 */
public class Contact {

    private String name,number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }

    public static Contact create_Contact(String name,String number){
        return new Contact(name,number);
    }



}
