package com.metanit;

import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной а: ");
        double a=scan.nextDouble();
        System.out.print("Введите значение переменной b: ");
        double b=scan.nextDouble();
        System.out.print("Введите значение переменной c: ");
        double c=scan.nextDouble();
        double z=((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Значение выражения = "+z);

    }
}
