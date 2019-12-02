package com.metanit.ship;

public class Ship {
    private int number;
    private double carryingCapacity;
    private double currentAmountOfCargo;

        public Ship(int number, double carryingCapacity,double currentAmountOfCargo) {
            this.number=number;
        this.carryingCapacity = carryingCapacity;
        this.currentAmountOfCargo=currentAmountOfCargo;
    }

    public int getNumber() {
        return number;
    }

    public void setCurrentAmountOfCargo(double currentAmountOfCargo) {
        this.currentAmountOfCargo = currentAmountOfCargo;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public double getCurrentAmountOfCargo() {
        return currentAmountOfCargo;
    }
}
