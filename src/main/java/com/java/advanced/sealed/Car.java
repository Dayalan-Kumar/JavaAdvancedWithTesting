package com.java.advanced.sealed;

// sealed keyword - car class is subclass it can also be sealed by using sealed keyword using permits

//non-sealed keyword -any class can extend the Car subclass

public sealed class Car extends Vehicle implements SmartMediaPlayer permits FlyingCar {
    @Override
    public String drive() {
        return "CAR";
    }

    @Override
    public void connectPhone() {
        System.out.println("Phone connected");
    }
}
