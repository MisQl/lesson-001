package com.example.generics;

public class IntegersCollection {

    private int table[];

    public IntegersCollection(int size) {
        table = new int[size];
    }

    public void set(int index, int value) {
        table[index] = value;
    }

    public int get(int index) {
        return table[index];
    }

    public void showAll(){
        for (int value : table) {
            System.out.println(value);
        }
    }
}
