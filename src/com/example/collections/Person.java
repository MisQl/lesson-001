package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Person { // immutable

    private final String name;
    private final Integer age;
    private final List<String> address;

    public Person(String name, Integer age, List<String> address) {
        this.name = name;
        this.age = age;
        this.address = new ArrayList<>(address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address.size());
    }
}
