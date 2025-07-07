package com.java.advanced.sealed;

//public final class Truck extends Vehicle{
public non-sealed class Truck extends Vehicle{
    @Override
    public String drive() {
        return "TRUCK";
    }
}
