package com.ludowica.salesapi.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int businessId;
    private String customerName;
    private int customerId;
    private String item;
    private double price;
    private int qty;
    private String dueDate;
    private String modeOfShipment;
    private String productionStatus;
    private String orderStatus;
    private String warehouseStatus;

    /*@OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    @JsonManagedReference
    private OrderStatus orderStatus;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getModeOfShipment() {
        return modeOfShipment;
    }

    public void setModeOfShipment(String modeOfShipment) {
        this.modeOfShipment = modeOfShipment;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getWarehouseStatus() {
        return warehouseStatus;
    }

    public void setWarehouseStatus(String warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
    }
}
