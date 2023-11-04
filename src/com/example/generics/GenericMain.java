package com.example.generics;

public class GenericMain {

    public static void main(String[] args) {
        GenericCollection<Integer> ageCollection = new GenericCollection<>(5);

        ageCollection.set(0, 10);
        ageCollection.set(1, 20);
        ageCollection.set(2, 30);
        ageCollection.set(3, 40);
        ageCollection.set(4, 50);

        System.out.println(ageCollection.get(3));

        GenericCollection<String> nameCollection = new GenericCollection<>(5);

        nameCollection.set(0, "Adam");
        nameCollection.set(1, "Damian");
        nameCollection.set(2, "Sandra");
        nameCollection.set(3, "Kasia");
        nameCollection.set(4, "Jacek");

        System.out.println(nameCollection.get(3));
    }
}
