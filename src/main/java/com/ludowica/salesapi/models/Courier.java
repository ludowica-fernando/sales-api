package com.ludowica.salesapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courier {
    @Id
    private int id;
    private String name;
    private int telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
