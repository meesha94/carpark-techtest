package org.example;
import java.util.ArrayList;

public class Van extends Vehicle {

    public Van(){

        regularSpacesNeeded = 3;
        largeSpacesNeeded = 1;
        size = VehicleType.Van;

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





