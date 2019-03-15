package com.ludowica.salesapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderName;
    private double price;
    private int qty;
    private String dueDate;
    private String modeOfShipment;
    private boolean productionStatus;
    private boolean orderStatus;
    private boolean warehouseStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
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

    public boolean isProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(boolean productionStatus) {
        this.productionStatus = productionStatus;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isWarehouseStatus() {
        return warehouseStatus;
    }

    public void setWarehouseStatus(boolean warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
    }
}
