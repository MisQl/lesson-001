package com.example.company;

public class Secretary extends Employee {

    public Secretary(String name) {
        super(name, 1100);
    }

    public Secretary(String name, Integer salary) {
        super(name, salary);
    }

    @Override
    public void show() {
        System.out.println("Jestem sekretarką i mam na imie: " + name);
    }

    public void call() {
        System.out.println("Mam na imie " + name + " i dzwonie");
    }

    @Override
    public void complaining() {
        System.out.println("Za mało zarabiam");
    }
}
