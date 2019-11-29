package com.epam.gitLearn;

public class Person {
    private  String name;
    private byte age;
    private HomeAnimal animal;

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public void setAnimal(HomeAnimal animal) {
        this.animal = animal;
    }
}
