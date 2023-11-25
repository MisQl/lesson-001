package com.example.functional;

import com.example.company.Manager;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        getNumber("123").ifPresent(System.out::println);
        getNumber("abc").ifPresent(System.out::println);
        getNumber(null).ifPresent(System.out::println);

        calculateBonus(null).ifPresent(System.out::println);
        calculateBonus(new Manager("Jan")).ifPresent(System.out::println);
        calculateBonus(new Manager("Janusz")).ifPresent(System.out::println);

        Integer x = Optional.ofNullable(1)
                .orElse(getDefaultValue());

        Integer y = Optional.ofNullable(10)
                .orElseGet(() -> getDefaultValue());
    }

    public static Integer processManger(Manager manager) {
        return Optional.ofNullable(manager)
                .flatMap(m -> calculateBonus(m))
                .orElse(100);
    }

    public static Optional<Integer> getNumber(String input) {
        try {
            return Optional.ofNullable(input).map(Integer::parseInt);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static Optional<Integer> calculateBonus(Manager manager) {
        return Optional.ofNullable(manager)
                .map(Manager::getName)
                .map(String::length)
                .filter(length -> length > 5)
                .map(length -> length * 100);
    }

    public static Integer getDefaultValue() {
        System.out.println("generating default value...");
        return 100;
    }
}
