package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.print("Введите сторону правильного шестиугольника: ");
        double a=scan.nextInt();
        areaCalculation(a);
    }

    private static void areaCalculation(double b){
    double area=6*((Math.sqrt(3)*Math.pow(b,2))/4);
        System.out.println("Площадь правильного шестиугольника со стороной "+b+" равна "+Math.round(area*100.0)/100.0);
    }
}
