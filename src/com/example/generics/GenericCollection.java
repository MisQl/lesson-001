package com.example.generics;

public class GenericCollection<T> {

    private T tableOne[];

    public GenericCollection(int size) {
        tableOne = (T[]) new Object[size];
    }

    public GenericCollection(int size, int weight) {
        tableOne = (T[]) new Object[size * weight];
    }

    public void set(int index, T value) {
        tableOne[index] = value;
    }

    public T get(int index) {
        return tableOne[index];
    }

    public void showAll() {
        for (T value : tableOne) {
            System.out.println(value);
        }
    }
}
