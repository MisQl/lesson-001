package com.example.company;

public interface Worker {

    static final int SALARY_DAY = 10;

    public abstract void work();

    default void takeBrake() {
        String name = getName();
        System.out.println("Ide na przerwe, mam na imie: " + name);
    }

    String getName();
}
