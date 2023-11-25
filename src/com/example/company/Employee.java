package com.example.company;

public abstract class Employee {

    protected String name;
    private Integer salary;

    public Employee() {
        System.out.println("Employee()");
    }

    public Employee(String name) {
        System.out.println("Employee(String name)");
        this.name = name + " Kowalski";
        this.salary = 1000;
    }

    public Employee(String name, Integer salary) {
//        System.out.println("Employee(String name, Integer salary)");
        this.name = name;
        this.salary = salary;
    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    public abstract void complaining();
}
