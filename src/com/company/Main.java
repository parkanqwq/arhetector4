package com.company;

import com.company.adapter.AdapterCarRobot;

public class Main {

    public static void main(String[] args) {

        Human humanMax = new Human("Max", 28, 61.5f);
        Robot robotBany = new Robot("Bany", 25, 255);
        Car car = new Car("BMV", "Red");
        car.setdounCar(humanMax);
        AdapterCarRobot adapterCarRobot = new AdapterCarRobot(robotBany);
        car.setdounCar(adapterCarRobot);
        System.out.println("вес " + robotBany.getName() + " " + adapterCarRobot.getWeight());
    }
}
