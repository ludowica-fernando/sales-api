package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.Customer;
import com.ludowica.salesapi.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable int id){
        return customerRepo.findById(id);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerRepo.deleteById(id);
    }

}
