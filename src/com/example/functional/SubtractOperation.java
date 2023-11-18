package com.example.functional;

public class SubtractOperation implements MathOperation {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
