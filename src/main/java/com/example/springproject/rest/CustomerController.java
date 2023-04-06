package com.example.springproject.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/find/{id}")
    public Customer getCustomer(@PathVariable("id") long customerId) {
        Customer customer = new Customer(customerId, "Yıldırım Gürses", 65750);
        return customer;
    }

    @GetMapping("/list")
    public List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(601, "Yildirim Gurses", 65750));
        customerList.add(new Customer(602, "Teoman Alpay", 87600));
        customerList.add(new Customer(603, "Yusuf Nalkasen", 34865));
        return  customerList;
    }

    @PostMapping("/create")
    public long createCustomer(@RequestBody Customer customer) {
        System.out.println("Ekleniyor: " + customer.getCustomerName());
        customer.setCustomerId(604);
        return customer.getCustomerId();
    }

}
