package com.metanit.port;

import java.util.ArrayList;

public class Port {
    private ArrayList <Berth> berth;
    private double capacity;
    private double currentAmountOfCargo;
    private double cargoReservation;

    public Port() {
        this.berth= new ArrayList<>();
        this.capacity=50.0;
        this.currentAmountOfCargo=14.50;
        this.cargoReservation=0.0;
    }

    public void addBerth(Berth berth) {
        this.berth.add(berth);
    }


    public ArrayList<Berth> getBerth() {
        return berth;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCargoReservation(double cargoReservation) {
        this.cargoReservation = cargoReservation;
    }

    public double getCargoReservation() {
        return cargoReservation;
    }

    public double getCurrentAmountOfCargo() {
        return currentAmountOfCargo;
    }

    public void setCurrentAmountOfCargo(double currentAmountOfCargo) {
        this.currentAmountOfCargo = currentAmountOfCargo;
    }
}
