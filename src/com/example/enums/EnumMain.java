package com.example.enums;

public class EnumMain {

    public static void main(String[] args) {
        Size boxSize1 = Size.SMALL;
        Size boxSize2 = Size.SMALL;
        Size boxSize3 = Size.LARGE;
        Size boxSize4 = Size.MEDIUM;
        System.out.println(boxSize1.getPrice());
        System.out.println(boxSize2.getPrice());
        System.out.println(boxSize3.getPrice());
        System.out.println(boxSize4.getPrice());

        Size.test();
    }
}
