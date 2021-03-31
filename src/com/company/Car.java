package com.company;

public class Car <T>{

    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setdounCar(Human human){
        float canGoCar = 150.0f;
        if (canGoCar >= human.getWeight())
            System.out.println(human.getName() + " успешно сел в машину");
        else System.out.println(human.getName() + ", ваш вес слишком большой, не можите сесть в машину");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
