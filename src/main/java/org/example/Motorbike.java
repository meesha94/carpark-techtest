package org.example;

import java.util.ArrayList;

public class Motorbike extends Vehicle {

    public Motorbike(){
        smallSpacesNeeded = 1;
        regularSpacesNeeded = 1;
        largeSpacesNeeded = 1;
        size = VehicleType.Motorbike;

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

        return true;
    }

};




