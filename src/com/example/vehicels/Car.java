package com.example.vehicels;

public class Car {

    private String model;
    private String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}