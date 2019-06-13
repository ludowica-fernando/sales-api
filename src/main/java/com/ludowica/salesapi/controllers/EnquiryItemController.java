package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.EnquiryItem;
import com.ludowica.salesapi.repository.EnquiryItemRepo;
import com.ludowica.salesapi.repository.EnquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enquiry-items")
public class EnquiryItemController {

    @Autowired
    EnquiryRepo enquiryRepo;

    @Autowired
    EnquiryItemRepo enquiryItemRepo;

    @GetMapping
    public List<EnquiryItem> getAllEnquiryItems(){
        return enquiryItemRepo.findAll();
    }

    @PostMapping
    public EnquiryItem sendAllEnquiryItems(@RequestBody EnquiryItem enquiryItem){
        return enquiryItemRepo.save(enquiryItem);
    }

}
