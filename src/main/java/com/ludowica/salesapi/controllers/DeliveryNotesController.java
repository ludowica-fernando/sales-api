package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.DeliveryNotes;
import com.ludowica.salesapi.repository.DeliveryNoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/deliverynotes")
public class DeliveryNotesController {
    @Autowired
    DeliveryNoteRepo deliveryNoteRepo;

    @GetMapping
    public List<DeliveryNotes> getDeliveryNotes(){
        return deliveryNoteRepo.findAll();
    }

    @PostMapping
    public DeliveryNotes sendDeliveryNotes(@RequestBody DeliveryNotes deliveryNotes){
        return deliveryNoteRepo.save(deliveryNotes);
    }

}
