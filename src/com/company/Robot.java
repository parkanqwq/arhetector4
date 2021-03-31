package com.company;

public class Robot {

    private String name;
    private int age;
    private int weightMega;

    public Robot(String name, int age, int weightMega) {
        this.name = name;
        this.age = age;
        this.weightMega = weightMega;
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

    public int getWeightMega() {
        return weightMega;
    }

    public void setWeightMega(int weightMega) {
        this.weightMega = weightMega;
    }
}
