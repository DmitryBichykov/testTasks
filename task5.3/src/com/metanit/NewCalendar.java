package com.metanit;


import java.util.Arrays;

public class NewCalendar {
    private DayOffAndHoliday[] dayOffAndHolidays;
    private int index;


    public NewCalendar() {
        index=0;
        dayOffAndHolidays=new DayOffAndHoliday[0];
    }

    public void setDayOffAndHolidays(DayOffAndHoliday dayOffAndHolidays) {
        this.dayOffAndHolidays= Arrays.copyOf(this.dayOffAndHolidays,this.dayOffAndHolidays.length+1);
        this.dayOffAndHolidays[index++] = dayOffAndHolidays;
    }

    public DayOffAndHoliday[] getDayOffAndHolidays() {
        return dayOffAndHolidays;
    }

    static class DayOffAndHoliday{
        private int day;
        private int month;
        private int year;

        public DayOffAndHoliday(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
    }
}
