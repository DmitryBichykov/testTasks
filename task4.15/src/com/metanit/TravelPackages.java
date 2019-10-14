package com.metanit;


public class TravelPackages {
    private Destination destination;
    private TypeOfRest typeOfRest;
    private Transport transport;
    private Food food;
    private TravelTime travelTime;

    public TravelPackages(Destination destination, TypeOfRest typeOfRest, Transport transport, Food food, TravelTime travelTime) {
        this.destination = destination;
        this.typeOfRest = typeOfRest;
        this.transport = transport;
        this.food = food;
        this.travelTime = travelTime;
    }

    public TypeOfRest getTypeOfRest() {
        return typeOfRest;
    }

    public Transport getTransport() {
        return transport;
    }

    public Food getFood() {
        return food;
    }

    public TravelTime getTravelTime() {
        return travelTime;
    }

    public String toString() {
        return String.format("%-15S|\t%-15s|\t%-25s|\t%-25s|\t%-25s",destination.getDestination(),typeOfRest.getTypeOfRest(),
                transport.getTransport(),food.getFood(),travelTime.getTravelTime());
    }
}
