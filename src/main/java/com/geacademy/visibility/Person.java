package com.geacademy.visibility;


public class Person {
    private String firstName;
    private String lastName;

    public Person(String ln, String fn) {
        firstName = fn;
        lastName = ln;
    }

    public Person() {
    }

    public void setFirstName(String fn) {
        firstName = fn.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "com.geacademy.visibility.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
