package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerService {

    public static String email;
    public static String firstName;
    public static String lastName;
    public static String customerEmail;
    public static List<Customer> customers = new ArrayList<Customer>();

    public CustomerService(String email, String firstName, String lastName, String customerEmail) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerEmail = customerEmail;
    }


    public static void addCustomer(String email, String firstName, String lastName){
        customers.add(new Customer(firstName, lastName, email));
    }

    public static Customer getCustomer(String customerEmail){
        for (Customer customer : customers){
            if(customer.email == customerEmail){
                return customer;
            }
        }
        return null;
    }

    public static Collection<Customer> getAllCustomers() {
/*
        List<Customer> allCustomers = new ArrayList<Customer>();

        for (Customer customer : customers) {
            allCustomers.add(customer);
        }
        return allCustomers;
*/
        return customers;
    }

}
