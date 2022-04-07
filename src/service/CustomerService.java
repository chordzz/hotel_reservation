package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerService {

    private static CustomerService customerService = null;
    public static List<Customer> customers = new ArrayList<Customer>();

    public String email;
    public String firstName;
    public String lastName;
    public String customerEmail;

    public CustomerService() {};

    public CustomerService(String email, String firstName, String lastName, String customerEmail) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerEmail = customerEmail;
    }

    public static CustomerService getInstance() {
        if (customerService == null)
            customerService = new CustomerService();

        return customerService;
    }


    public void addCustomer(String email, String firstName, String lastName){
        customers.add(new Customer(firstName, lastName, email));
    }

    public Customer getCustomer(String customerEmail){
        for (Customer customer : customers){
            if(customer.email.equals(customerEmail)){
                return customer;
            }
        }
        return null;
    }

    public Collection<Customer> getAllCustomers() {
        return customers;
    }

}
