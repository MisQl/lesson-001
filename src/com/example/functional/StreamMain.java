package com.example.functional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        Stream.generate(() -> Math.random() * 10)
                .limit(10)
                .map(number -> number * 2)
                .filter(number -> number > 5)
                .forEach(System.out::println);

        System.out.println("-----");

        var list = List.of(5, 5, 6, 7, 8, 9, 10, 10, 1, 2, 3, 4, 5);

        list.stream()  // trace current stream chain
                .filter(number -> number > 5)
                .sorted()
                .skip(2)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-----");

        Map<Integer, List<Integer>> nextCollection = list.stream()
                .filter(number -> number > 5)
                .sorted()
                // .distinct()
                .map(number -> number * 2)
                .collect(Collectors.groupingBy(a -> a * 2));

        System.out.println(nextCollection);
    }
}
