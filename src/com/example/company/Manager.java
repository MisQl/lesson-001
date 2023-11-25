package com.example.company;

public class Manager extends Employee implements Worker {

    private Secretary secretary;
    private Integer bonus;

    public Manager(String name) {
        super(name, 2000);
//        System.out.println("Manager(String name)");
    }

    @Override
    public void show() {
        System.out.println("Jestem managerem i mam na imie: " + super.name);
    }

    @Override
    public void complaining() {
        System.out.println("Nie narzekam, jest super");
    }

    @Override
    public void work() {
        System.out.println("Manager pracuje");
    }

    @Override
    public String getName() {
        return this.name;
    }

//    @Override
//    public void takeBrake() {
//        System.out.println("Jestem managerm i nie chodze na przerwy");
//    }
}
