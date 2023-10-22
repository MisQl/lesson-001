package com.example.vehicels;

public class CarApplication {

    public static void main(String[] args) {
        Car myCar = new Car("e46", "BMW");
        Car otherCar = new Car("A8", "Audi");

        otherCar.setModel("A7");
        System.out.println(otherCar.getModel());
    }
}
