package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Введите значение переменной x: ");
	double x=scan.nextDouble();
	System.out.print("Введите значение переменной y: ");
	double y=scan.nextDouble();
    double z=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
    System.out.println("Значение выражения = "+z);
    }
}
