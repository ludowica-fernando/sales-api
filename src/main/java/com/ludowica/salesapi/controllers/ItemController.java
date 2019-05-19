package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.Item;
import com.ludowica.salesapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public List<Item> getAllEnquiries(){
        return itemService.getAllItems();
    }

}
