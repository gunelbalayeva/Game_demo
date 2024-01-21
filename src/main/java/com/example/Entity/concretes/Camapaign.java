package com.example.Entity.concretes;

import com.example.Entity.abstracts.Entity;

import java.util.Date;

public class Camapaign implements Entity {

    private int id;
    private String name;
    private String description;
    private Date dateOfBegin;
    private Date dateOfEnd;
    private int discount;

    public Camapaign() {
    }

    public Camapaign(int id, String name, String description, Date dateOfBegin, Date dateOfEnd, int discount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateOfBegin = dateOfBegin;
        this.dateOfEnd = dateOfEnd;
        this.discount = discount;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(Date dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
