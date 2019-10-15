package com.metanit;

public class Main {

    public static void main(String[] args) {
	    NewCalendar newCalendar=new NewCalendar();
        NewCalendar.DayOffAndHoliday date1=new NewCalendar.DayOffAndHoliday(8,3,2020);
        NewCalendar.DayOffAndHoliday date2=new NewCalendar.DayOffAndHoliday(3,7,2020);
        NewCalendar.DayOffAndHoliday date3=new NewCalendar.DayOffAndHoliday(1,5,2020);
        NewCalendar.DayOffAndHoliday date4=new NewCalendar.DayOffAndHoliday(1,1,2020);
        NewCalendar.DayOffAndHoliday date5=new NewCalendar.DayOffAndHoliday(7,1,2020);
        newCalendar.setDayOffAndHolidays(date1);
        newCalendar.setDayOffAndHolidays(date2);
        newCalendar.setDayOffAndHolidays(date3);
        newCalendar.setDayOffAndHolidays(date4);
        newCalendar.setDayOffAndHolidays(date5);
        System.out.println("Выходные и праздничные дни:");
        for (NewCalendar.DayOffAndHoliday i:newCalendar.getDayOffAndHolidays()) {
            System.out.printf("%d.%d.%d г.\n", i.getDay(),i.getMonth(),i.getYear());
        }
    }
}
