package com.example.springboottutorial;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoy extends CrudRepository<Customer, Integer> {

    Customer findCustomerById(Integer id);
}
