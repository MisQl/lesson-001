package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {

    public static void main(String[] args) {
        List<Book> myCollection = new ArrayList<>();
        myCollection.add(new Book("W pustyni i w puszczy", 300));
        myCollection.add(new Book("W pustyni i w puszczy", 300));
        myCollection.add(new Book("Krzyżacy", 1000));
        myCollection.add(new Book("Dziady", 250));

        BookTitleSorter bookTitleSorter = new BookTitleSorter();
        BookMixSorter bookMixSorter = new BookMixSorter();
        Collections.sort(myCollection, bookMixSorter);

        for (Book value : myCollection) {
            System.out.println(value);
        }

        Book object1 = new Book("W pustyni i w puszczy", 300);
        Book object2 = new Book("W pustyni i w puszczy", 300);
        System.out.println("Porównanie == " + (object1 == object2)); // false
        System.out.println("Porównanie equals " + (object1.equals(object2))); // false

        boolean result = myCollection.contains(object1);
        System.out.println("Result: " + result);
    }
}
