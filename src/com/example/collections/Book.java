package com.example.collections;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String title;
    private Integer pages;

    public Book(String title, Integer pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(pages, book.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }

    @Override
    public String toString() {
        return "Book{title=" + title + ", pages=" + pages + '}';
    }

    @Override
    public int compareTo(Book book) {
        return this.pages - book.pages;
    }
}
