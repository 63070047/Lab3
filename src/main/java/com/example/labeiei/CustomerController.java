package com.example.labeiei;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController(){
        this.customers = new ArrayList<>();
        this.customers.add(new Customer("1010", "John", "Male", 25));
        this.customers.add(new Customer("1018", "Peter", "Male", 24));
        this.customers.add(new Customer("1019", "Sara", "Female", 23));
        this.customers.add(new Customer("1110", "Rose", "Female", 23));
        this.customers.add(new Customer("1001", "Emma", "Female", 30));
    }

    @RequestMapping(value="/customers")
    public List<Customer> getCustomers(){
        return this.customers;
    }
//    public Customer getCustomerByID (String ID){
//
//    }
}
