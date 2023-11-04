package com.example.enums;

public enum Size {

    SMALL(10), MEDIUM(100), LARGE(1000);

    private Integer price;

    Size(Integer price) {
        System.out.println("Size(" + price + ")");
        this.price = price + 1;
    }

    public Integer getPrice() {
        return price;
    }

    public static void test() {
        System.out.println("test");
    }
}
