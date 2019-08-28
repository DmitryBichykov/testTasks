package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double y;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите начальное значение отрезка: ");
        double a=scan.nextDouble();
        System.out.print("Введите конечное значение отрезка: ");
        double b=scan.nextDouble();
        System.out.print("Введите нразмер шага: ");
        double h=scan.nextDouble();
        for(double x=a; x<=b; x+=h){
            if (x>2){
                y=x;
            }else {
                y=-1*x;
            }
            System.out.println("Значение функции y при x="+x+" равно "+y);
        }

    }
}
