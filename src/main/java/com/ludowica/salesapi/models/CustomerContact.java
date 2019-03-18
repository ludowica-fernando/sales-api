package com.ludowica.salesapi.models;

import javax.persistence.*;

@Entity
public class CustomerContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String mainLocation;
    private String deliveryLocation;
    private String collectionLocation;
    private int telephone;
    private String email;

    @OneToOne(mappedBy = "customercontact")
    private Customer customer;

    public CustomerContact(String mainLocation, String deliveryLocation, String collectionLocation, int telephone, String email) {
        this.mainLocation = mainLocation;
        this.deliveryLocation = deliveryLocation;
        this.collectionLocation = collectionLocation;
        this.telephone = telephone;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(String mainLocation) {
        this.mainLocation = mainLocation;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getCollectionLocation() {
        return collectionLocation;
    }

    public void setCollectionLocation(String collectionLocation) {
        this.collectionLocation = collectionLocation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
