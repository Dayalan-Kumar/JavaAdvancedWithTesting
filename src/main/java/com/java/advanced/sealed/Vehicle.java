package com.java.advanced.sealed;

// by making the sealed class abstract class, the behaviour will be same as regular abstract class
public sealed abstract class Vehicle permits Car,  Truck{
    public abstract String drive();
}

