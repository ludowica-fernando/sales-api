package com.ludowica.salesapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String deliveryMethod;
    private String courierName;
    private String courierTelephone;
    private String creditStatus;

    @OneToMany(mappedBy = "enquiry", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("enquiry")
    private Set<EnquiryItem> enquiryItems;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getCourierTelephone() {
        return courierTelephone;
    }

    public void setCourierTelephone(String courierTelephone) {
        this.courierTelephone = courierTelephone;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public Set<EnquiryItem> getEnquiryItems() {
        return enquiryItems;
    }

    public void setEnquiryItems(Set<EnquiryItem> enquiryItems) {
        this.enquiryItems = enquiryItems;
        this.enquiryItems.forEach(enquiryItem -> enquiryItem.setEnquiry(this));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
