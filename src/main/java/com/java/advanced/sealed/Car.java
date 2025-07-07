package com.java.advanced.sealed;

// sealed keyword - car class is subclass it can also be sealed by using sealed keyword using permits

//non-sealed keyword -any class can extend the Car subclass

public sealed class Car extends Vehicle permits FlyingCar {
    @Override
    public String drive() {
        return "CAR";
    }
}
