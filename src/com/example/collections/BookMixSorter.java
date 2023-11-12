package com.example.collections;

import java.util.Comparator;

public class BookMixSorter implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        var pages1 = o1.getPages();
        var title1 = o1.getTitle();
        var pages2 = o2.getPages();
        var title2 = o2.getTitle();
        return (pages1 * title1.length()) - (pages2 * title2.length());
    }
}
