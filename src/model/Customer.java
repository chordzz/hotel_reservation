package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;

    public Customer (String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        String emailRegex = "^(.+)@(.+)[.](.+)$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);

        if (!m.matches()){
            throw new IllegalArgumentException("Wrong email format");
        }

    }

    @Override
    public String toString() {
        return "Firstname: "+ this.firstName +"\tLastname: "+ this.lastName +"\nEmail: "+this.email;
    }
}
