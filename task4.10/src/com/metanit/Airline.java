package com.metanit;

public class Airline {
    private String destination;
    private int flightNumber;
    private String typeOfAircraft;
    private String departureTime;
    private String daysOfTheWeek;

    public Airline(String destination, int flightNumber, String typeOfAircraft, String departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String toString(){
        return String.format("Пунки назначения: %S\tНомер рейса: %d\tТип самолета: %s\tВремя вылета: %s\tДни недели: %s",
                destination,flightNumber,typeOfAircraft,departureTime,daysOfTheWeek);
    }
}
