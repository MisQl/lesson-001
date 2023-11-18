package com.example.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalMain {

    public static void main(String[] args) {
        calculate(10, 5, new AddOperation());
        calculate(10, 5, new SubtractOperation());
        calculate(10, 5, new MultiplyOperation());

        MathOperation mySuperOperation = new MathOperation() {
            @Override
            public int calculate(int a, int b) {
                return a * b + 2 * a;
            }
        };
        calculate(10, 5, mySuperOperation);

        calculate(10, 5, (a, b) -> a * b + 2 * a);

        Function<Integer, String> x = a -> String.valueOf(a);
        Function<Integer, String> y = String::valueOf;

        // ----------------

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer number : numbers) {
            if (number < 3) {
                System.out.println(number * 2);
            }
        }

        numbers.stream()
                .filter(number -> number < 3)
                .map(number -> number * 2)
                .forEach(System.out::println);
    }

    private static void calculate(int x, int y, MathOperation operation) {
        System.out.println("Result: " + operation.calculate(x, y));
    }
}
