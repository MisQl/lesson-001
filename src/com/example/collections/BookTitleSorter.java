package com.example.collections;

import java.util.Comparator;

public class BookTitleSorter implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        var title1 = o1.getTitle();
        var title2 = o2.getTitle();
        return title1.compareTo(title2);
    }
}
