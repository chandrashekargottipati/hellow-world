package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "john.doe@example.com");
        Mysqlconnectdb repositry = new Mysqlconnectdb();
        CustomerService customerService = new CustomerServiceImpl(repositry);
        customerService.addCustomertodb(customer);
        customerService.displaycustomerdata(customer);
    }
}