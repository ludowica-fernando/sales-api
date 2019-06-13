package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.forms.OrderStatusForm;
import com.ludowica.salesapi.models.Enquiry;
import com.ludowica.salesapi.repository.EnquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enquiries")
public class EnquiryController {

    @Autowired
    EnquiryRepo enquiryRepo;

    @GetMapping
    public List<Enquiry> getAllEnquiries() {
        return enquiryRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Enquiry> getEnquiry(@PathVariable int id) {
        return enquiryRepo.findById(id);
    }

    @PostMapping
    public Enquiry addEnquiry(@RequestBody Enquiry enquiry) {
        return enquiryRepo.save(enquiry);
    }

    @PutMapping
    public Enquiry updateEnquiry(@RequestBody Enquiry enquiry) {
        return enquiryRepo.save(enquiry);
    }

    @PutMapping("/updateOrder")
    public Enquiry updateOrderStatus(@RequestBody OrderStatusForm orderStatusForm) {
        Enquiry enquiry = enquiryRepo
                .findById(orderStatusForm.getOrderId())
                .orElseThrow(() -> new ResourceNotFoundException("Order not found for this id :: " + orderStatusForm.getOrderId()));

        if (!((orderStatusForm.getOrderStatus().equals("Production")) || (orderStatusForm.getOrderStatus().equals("Shipped")))) {

            throw new ResourceNotFoundException("Order status is invalid :: " + orderStatusForm.getOrderId());
        }
        enquiry.setOrderStatus(orderStatusForm.getOrderStatus());
        return enquiryRepo.save(enquiry);
    }

    @DeleteMapping
    public void deleteEnquiry(@PathVariable int id) {
        enquiryRepo.deleteById(id);
    }
}
