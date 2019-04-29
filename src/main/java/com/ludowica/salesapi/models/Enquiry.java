package com.ludowica.salesapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int customerId;
    private String item;
    private int qty;
    private String itemAvailability;
    private String deliveryMethod;
    private String courierName;
    private String courierTelephone;
    private String creditStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getItemAvailability() {
        return itemAvailability;
    }

    public void setItemAvailability(String itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
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
}
