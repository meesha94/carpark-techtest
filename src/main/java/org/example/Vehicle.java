package org.example;

import java.util.ArrayList;

//Vehicle to be parked, looks at vehicle type
public abstract class Vehicle {

    public ArrayList<ParkingSpace> parkingSpacesSmall = new ArrayList<>();
    public ArrayList<ParkingSpace> parkingSpacesRegular = new ArrayList<>();
    public ArrayList<ParkingSpace> parkingSpacesLarge = new ArrayList<>();

    public  VehicleType vehicleType;

    public int smallSpacesNeeded;
    public int regularSpacesNeeded;
    public int largeSpacesNeeded;

    public VehicleType size;


    public Vehicle(ArrayList<ParkingSpace> parkingSpacesSmall, ArrayList<ParkingSpace> parkingSpacesRegular, ArrayList<ParkingSpace> parkingSpacesLarge, VehicleType vehicleType, int smallSpacesNeeded, int regularSpacesNeeded, int largeSpacesNeeded, VehicleType size) {
        this.parkingSpacesSmall = parkingSpacesSmall;
        this.parkingSpacesRegular = parkingSpacesRegular;
        this.parkingSpacesLarge = parkingSpacesLarge;
        this.vehicleType = vehicleType;
        this.smallSpacesNeeded = smallSpacesNeeded;
        this.regularSpacesNeeded = regularSpacesNeeded;
        this.largeSpacesNeeded = largeSpacesNeeded;
        this.size = size;
    }

    //getters and setters

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ArrayList<ParkingSpace> getParkingSpacesSmall() {
        return parkingSpacesSmall;
    }

    public void setParkingSpacesSmall(ArrayList<ParkingSpace> parkingSpacesSmall) {
        this.parkingSpacesSmall = parkingSpacesSmall;
    }

    public ArrayList<ParkingSpace> getParkingSpacesRegular() {
        return parkingSpacesRegular;
    }

    public void setParkingSpacesRegular(ArrayList<ParkingSpace> parkingSpacesRegular) {
        this.parkingSpacesRegular = parkingSpacesRegular;
    }

    public ArrayList<ParkingSpace> getParkingSpacesLarge() {
        return parkingSpacesLarge;
    }

    public void setParkingSpacesLarge(ArrayList<ParkingSpace> parkingSpacesLarge) {
        this.parkingSpacesLarge = parkingSpacesLarge;
    }

    public int getSmallSpacesNeeded() {
        return smallSpacesNeeded;
    }

    public void setSmallSpacesNeeded(int smallSpacesNeeded) {
        this.smallSpacesNeeded = smallSpacesNeeded;
    }

    public int getRegularSpacesNeeded() {
        return regularSpacesNeeded;
    }

    public void setRegularSpacesNeeded(int regularSpacesNeeded) {
        this.regularSpacesNeeded = regularSpacesNeeded;
    }

    public int getLargeSpacesNeeded() {
        return largeSpacesNeeded;
    }

    public void setLargeSpacesNeeded(int largeSpacesNeeded) {
        this.largeSpacesNeeded = largeSpacesNeeded;
    }

    public VehicleType getSize() {
        return size;
    }

    public void setSize(VehicleType size) {
        this.size = size;
    }


    public abstract boolean canFitSmallSpace(ParkingSpace smallSpace);
    public abstract boolean canFitRegularSpace(ParkingSpace regularSpace);
    public abstract boolean canFitLargeSpace(ParkingSpace largeSpace);

}
