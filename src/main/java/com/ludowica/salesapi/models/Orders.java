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
    private String item;
    private double price;
    private int qty;
    private String dueDate;
    private String modeOfShipment;

    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    @JsonManagedReference
    private OrderStatus orderStatus;

    public Orders() {
    }

    public Orders(String customerName, double price, int qty, String dueDate, String modeOfShipment, OrderStatus orderStatus) {
        this.customerName = customerName;
        this.price = price;
        this.qty = qty;
        this.dueDate = dueDate;
        this.modeOfShipment = modeOfShipment;
        this.orderStatus = orderStatus;
        this.orderStatus.setOrders(this);
    }

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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
