package com.example.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {
        try {
            var value = Integer.parseInt("abc");    // ctrl + click, ctrl + b,  ctrl + tab
            System.out.println(value);
        } catch (NumberFormatException ex) {
            System.out.println("Coś poszło nie tak");
        }
        System.out.println("Lecimy dalej");

        System.out.println("-------------");

        try {
            var salary1 = calculateSalary("Adam");
            var salary2 = calculateSalary("Damian");
            var salary3 = calculateSalary("Sandra");
            System.out.println("Pensja 1: " + salary1);
            System.out.println("Pensja 2: " + salary2);
            System.out.println("Pensja 3: " + salary3);
        } catch (MyException e) {
            System.out.println("Coś poszło nie tak");
        } catch (IllegalArgumentException e) {
            System.out.println("Coś poszło nie tak z argumentem");
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak: " + e.getClass().getSimpleName());
        }
        System.out.println("Lecimy dalej");
    }

    public static int calculateSalary(String name) throws MyException, IllegalArgumentException {
        if (name.startsWith("A")) {
            return 1000;
        }
        if (name.startsWith("J")) {
            throw new MyException();
        }
        if (name.startsWith("D")) {
            throw new IllegalArgumentException("Imie nie moze zaczynac sie od D");
        }
        return 800;
    }
}
