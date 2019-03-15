package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.Order;
import com.ludowica.salesapi.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable int id){
        return orderRepo.findById(id);
    }



}
