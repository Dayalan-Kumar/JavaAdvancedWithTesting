package com.java.advanced.sealed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void vehicleTest(){
        var car = new Car();
        var truck = new Truck();
        // check car is an instance of vehicle
        assertInstanceOf(Vehicle.class, car);
        assertInstanceOf(Vehicle.class, truck);
    }

}