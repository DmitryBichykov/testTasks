package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Time time=new Time(0,0,0);
        int operation=0;
        while (operation!=7) {
            System.out.println("Выберите необходимую операцию:");
            System.out.println("1. Установка времени;\n2. Установка отдельно часов;\n3. Установка отдельно минут;\n4. Установка отдельно секунд;\n5. Вывести текущее время;\n6. Изменить время на заданное количество; \n7. Закончить работу с программой.");
            operation = scan.nextInt();
            if (operation == 1) {
                System.out.print("Введите часы:");
                int hours = scan.nextInt();
                if (hours > 23 || hours < 0) hours = 0;
                System.out.print("Введите минуты:");
                int minutes = scan.nextInt();
                if (minutes > 59 || minutes < 0) minutes = 0;
                System.out.print("Введите секунды:");
                int seconds = scan.nextInt();
                if (seconds > 59 || seconds < 0) seconds = 0;
                time = new Time(hours, minutes, seconds);
            }
            if (operation == 2) {
                System.out.print("Введите часы:");
                int hours = scan.nextInt();
                time.setHours(hours);
            }
            if (operation == 3) {
                System.out.print("Введите часы:");
                int minutes = scan.nextInt();
                time.setMinutes(minutes);
            }
            if (operation == 4) {
                System.out.print("Введите часы:");
                int seconds = scan.nextInt();
                time.setSeconds(seconds);
            }
            if (operation==5) System.out.println(time.getHours()+":"+time.getMinutes()+":"+time.getSeconds());
            if (operation==6){
                System.out.println("1. На заданое количество часов;\n2. На заданное количество минут;\3. На заданное количество секунд.");
                int oper=scan.nextInt();
                System.out.print("Введите число на которое необходимо увеличить время: ");
                int number=scan.nextInt();
                if (oper==1) time.timeChangeGivenNumberHours(number);
                if (oper==2) time.timeChangeGivenNumberMinutes(number);
                if (oper==3) time.timeChangeGivenNumberSeconds(number);
            }
            if (operation > 7) System.out.println("Вы ввели недопустимое значение!");
        }
    }
}

class Time{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }


    public void timeChangeGivenNumberHours(int number){
        if (hours+number>23) {
            hours=number+hours-24;
        }else hours+=number;
    }

    public void timeChangeGivenNumberMinutes(int number){
        if (minutes+number>59){
            hours+=(minutes+number)/60;
            minutes=(minutes+number)-((minutes+number)/60)*60;
        }else minutes+=number;
    }

    public void timeChangeGivenNumberSeconds(int number){
        if (seconds+number>59){
            minutes+=(seconds+number)/60;
            seconds=(seconds+number)-((seconds+number)/60)*60;
        }else seconds+=number;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
