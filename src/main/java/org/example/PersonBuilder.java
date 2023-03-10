package org.example;

public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age = 0;             //optional
    protected String address = null;      //optional

    public PersonBuilder() {
    }


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age == 0 || age < 0) {
            throw new IllegalArgumentException("Передано неправильное значение возраста " + "(" + age + ")");
        } else {
            this.age = age;
        }
        return this;

    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalArgumentException("Не определены обязательные параметры - ИМЯ или ФАМИЛИЯ");
        }
        return new Person(this);
    }
}
