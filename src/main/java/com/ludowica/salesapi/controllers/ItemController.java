package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.Item;
import com.ludowica.salesapi.repository.ItemRepo;
import com.ludowica.salesapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    ItemRepo itemRepo;

    @GetMapping("/mm")
    public List<Item> getAllItemsMM(){
        return itemService.getAllItems();
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemRepo.save(item);
    }

}
