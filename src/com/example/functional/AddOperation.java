package com.example.functional;

public class AddOperation implements MathOperation {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
