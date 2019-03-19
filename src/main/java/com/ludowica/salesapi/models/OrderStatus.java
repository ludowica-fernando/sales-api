package com.ludowica.salesapi.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productionStatus;
    private String orderStatus;
    private String warehouseStatus;

    @OneToOne
    @JoinColumn
    @MapsId
    @JsonBackReference
    private Orders orders;

    public OrderStatus() {
    }

    public OrderStatus(String productionStatus, String orderStatus, String warehouseStatus, Orders orders) {
        this.productionStatus = productionStatus;
        this.orderStatus = orderStatus;
        this.warehouseStatus = warehouseStatus;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
