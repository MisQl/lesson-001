package com.example.functional;

public class MultiplyOperation implements MathOperation {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
