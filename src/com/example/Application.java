package com.example;

import com.example.company.*;

public class Application {

    public static void main(String[] args) {
        Employee employee = new Secretary("Alicja");
        employee.complaining();
        employee = new Manager("Jan");
        employee.complaining();

        if (employee instanceof Worker w) { // Worker w = (Worker) employee;
            w.work();
            w.takeBrake();
        }

        System.out.println("Dzien wyplaty: " + Worker.SALARY_DAY);

        Employee employee2 = new Employee("Borys",3000) {
            @Override
            public void complaining() {
                System.out.println("Ja nie narzekam");
            }
        };

        employee2.show();
        employee2.complaining();
    }
}