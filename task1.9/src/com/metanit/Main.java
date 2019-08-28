package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите координату x точки А: ");
        double x1=scan.nextDouble();
        System.out.print("Введите координату y точки А: ");
        double y1=scan.nextDouble();
        System.out.print("Введите координату x точки B: ");
        double x2=scan.nextDouble();
        System.out.print("Введите координату y точки B: ");
        double y2=scan.nextDouble();
        System.out.print("Введите координату x точки C: ");
        double x3=scan.nextDouble();
        System.out.print("Введите координату y точки C: ");
        double y3=scan.nextDouble();
        if (y1/x1==y2/x2 && y2/x2==y3/x3){
            System.out.println("Точки A B C лежат на одной прямой!");
        }else {
            System.out.println("Точки A B C не лежат на одной прямой!");
        }
    }
}
