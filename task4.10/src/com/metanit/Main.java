package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        AirlineBelavia airlineBelavia=new AirlineBelavia();
        airlineBelavia.setAirlines(new Airline("Хельсинки",122,"Boeing 737-800","14-20","пн"));
        airlineBelavia.setAirlines(new Airline("Москва",347," CRJ-200 LR","10-00","ср"));
        airlineBelavia.setAirlines(new Airline("Нью-Йорк",895,"Boeing 737-800","02-00","чт"));
        airlineBelavia.setAirlines(new Airline("Лондон",524,"Embraer 175","05-15","пт"));
        airlineBelavia.setAirlines(new Airline("Тель-авив",1022,"Boeing 737-500","19-23","сб"));
        airlineBelavia.setAirlines(new Airline("Монако",187,"Boeing 737-800","11-18","вс"));
        airlineBelavia.setAirlines(new Airline("Санкт-Петербург",52,"B CRJ-200 LR","07-00","вт"));
        airlineBelavia.setAirlines(new Airline("Берлин",102,"Embraer 175","06-40","пн"));
        airlineBelavia.setAirlines(new Airline("Париж",24,"Boeing 737-800","23-10","чт"));
        airlineBelavia.setAirlines(new Airline("Прага",1840,"Boeing 737-500","00-00","ср"));
        int operation=0;
        while (operation!=4) {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Вывести список рейсов для заданного пункта назначения;\n2. Вывести список рейсов для заданного дня недели;\n" +
                    "3. Вывети список рейсов для заданного дня недели, время вылета для которого больше заданного;\n4. Закончить работу с программой.");
            operation=scan.nextInt();
            scan.nextLine();
            if (operation==1){
                System.out.print("Введите пункт назначения: ");
                String destination=scan.nextLine();
                airlineBelavia.listOfFlightsForGivenDestination(destination);
            }
            if (operation==2){
                System.out.print("Введите день недели (в формате пн,вт,ср,чт,пт,сб,вс): ");
                String daysOfTheWeek=scan.nextLine();
                airlineBelavia.weeklyFlightSearch(daysOfTheWeek);
            }
            if (operation==3){
                System.out.print("Введите день недели (в формате пн,вт,ср,чт,пт,сб,вс): ");
                String daysOfTheWeek=scan.nextLine();
                System.out.print("Введите время вылета (в формате 00-00): ");
                String departureTime=scan.nextLine();
                airlineBelavia.searchForFlightByDayOfWeekAndSetTime(daysOfTheWeek,departureTime);
            }
            if (operation>4) System.out.println("Вы ввели недопустимое значение!");
        }

    }
}
