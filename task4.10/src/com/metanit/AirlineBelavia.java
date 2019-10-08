package com.metanit;

public class AirlineBelavia {
    private Airline[] airlines=new Airline[10];
    private int index=0;

    public void setAirlines(Airline airlines) {
        this.airlines[index] = airlines;
        index++;
    }

    public void listOfFlightsForGivenDestination(String destination){
        for (Airline i:airlines){
            if (i.getDestination().equals(destination)){
                System.out.println(i.toString());
            }
        }
    }

    public void weeklyFlightSearch(String daysOfWeek){
        for (Airline i:airlines){
            if (i.getDaysOfTheWeek().equals(daysOfWeek)){
                System.out.println(i.toString());
            }
        }
    }

    public void searchForFlightByDayOfWeekAndSetTime(String daysOfWeek, String departureTime){
        for (Airline i:airlines){
            if (i.getDaysOfTheWeek().equals(daysOfWeek) && i.getDepartureTime().compareTo(departureTime)>0){
                System.out.println(i.toString());
            }
        }
    }
}
