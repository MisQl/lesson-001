package com.example.generics;

public class StringsCollection {

    private String table[];

    public StringsCollection(int size) {
        table = new String[size];
    }

    public void set(int index, String value) {
        table[index] = value;
    }

    public String get(int index) {
        return table[index];
    }

    public void showAll(){
        for (String value : table) {
            System.out.println(value);
        }
    }
}
