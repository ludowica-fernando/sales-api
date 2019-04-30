package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.Orders;
import com.ludowica.salesapi.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer-orders")
public class CustomerOrderController {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping
    public List<Orders> getAllOrders(){
        return orderRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Orders> getOrder(@PathVariable int id){
        return orderRepo.findById(id);
    }

    @PostMapping
    public Orders addOrder(@RequestBody Orders orders){
        return orderRepo.save(orders);
    }

    @PutMapping
    public Orders updateOrder(@RequestBody Orders orders){
        return orderRepo.save(orders);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable int id){
        orderRepo.deleteById(id);
    }
}
