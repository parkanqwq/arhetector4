package com.company;

public class Human {

    private String name;
    private int age;
    private float weight;

    public Human(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
