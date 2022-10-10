package org.example;
import java.util.ArrayList;

public class Car extends Vehicle {

    public Car(){
        regularSpacesNeeded = 1;
        largeSpacesNeeded = 1;
        size = VehicleType.Car;
    }

    @Override
    public boolean canFitLargeSpace(ParkingSpace largeSpace) {

        return true;
    }

    @Override
    public boolean canFitRegularSpace(ParkingSpace regularSpace) {

        return true;
    }

    @Override
    public boolean canFitSmallSpace(ParkingSpace smallSpace) {

        return false;
    }

};





