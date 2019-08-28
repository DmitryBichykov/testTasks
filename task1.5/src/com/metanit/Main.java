package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите длительность прошедшего времени в секундах: ");
        int T=scan.nextInt();
        int hour=T/3600;
        int minutes=(T-hour*3600)/60;
        int sec=(T-hour*3600)-minutes*60;
        System.out.print("Время в преобразованном формате: "+hour+"ч "+minutes+"мин "+sec+"c.");
    }
}
