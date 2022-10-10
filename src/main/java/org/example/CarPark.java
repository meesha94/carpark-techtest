package org.example;

public class CarPark {
    private ParkingSpace[] spaces; // all spaces
    private int avialableSpaces = 0;

    private static final int spacesMax = 15;

    public CarPark(int numOfSpaces) {
        avialableSpaces = numOfSpaces;
        spaces = new ParkingSpace[numOfSpaces];
        int smallSpaces = numOfSpaces / 3;
        int regularSpaces = numOfSpaces / 3;
        int largeSpaces = numOfSpaces - smallSpaces - regularSpaces;


    }
}
