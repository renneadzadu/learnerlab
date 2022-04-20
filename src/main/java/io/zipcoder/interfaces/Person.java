package io.zipcoder.interfaces;

public class Person {
    final long id = 0;
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public Person(long id, String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}