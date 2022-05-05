package com.example.springboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    private CustomerRepositoy customerRepositoy;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last, @RequestParam long balance) {
        Customer customer = new Customer();
        customer.setFirstName(first);
        customer.setLastName(last);
        customer.setDeposit(balance);
        customerRepositoy.save(customer);
        return "Added new customer to repo!";
    }

    @PutMapping(path = "/update")
    public @ResponseBody Customer changeBalance(@RequestBody long balance, @RequestBody int id){
        //Customer customer = new Customer();
        Customer customer = customerRepositoy.findCustomerById(id);
        customer.setDeposit(balance);
        customerRepositoy.save(customer);
        return customer;
    }
    
    @GetMapping("/list")
    public Iterable<Customer> getCustomers(){
        return customerRepositoy.findAll();
    }

    @GetMapping("/find{id}")
    public Customer findCustomerById(@PathVariable Integer id) {
        return customerRepositoy.findCustomerById(id);
    }
}
