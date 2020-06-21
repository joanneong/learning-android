package com.example.fragmentsrecyclerviewchallenge;

public class Car {
    private String make;
    private String model;
    private String owner;
    private String ownerTel;

    public Car(String make, String model, String owner, String ownerTel) {
        this.make = make;
        this.model = model;
        this.owner = owner;
        this.ownerTel = ownerTel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }
}
