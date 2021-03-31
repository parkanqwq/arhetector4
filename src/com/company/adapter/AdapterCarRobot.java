package com.company.adapter;


import com.company.Human;
import com.company.Robot;

public class AdapterCarRobot extends Human {

    private Robot robot;

    public AdapterCarRobot(Robot robot){
        this.robot = robot;
    }

    public String getName() {
        return robot.getName();
    }

    public float getWeight(){
        return (float) robot.getWeightMega();
    }
}
