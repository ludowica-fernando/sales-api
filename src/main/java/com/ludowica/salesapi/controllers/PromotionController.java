package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.Promotion;
import com.ludowica.salesapi.repository.PromotionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    PromotionRepo promotionRepo;

    @GetMapping
    public List<Promotion> getPromotions(){
        return promotionRepo.findAll();
    }
}
