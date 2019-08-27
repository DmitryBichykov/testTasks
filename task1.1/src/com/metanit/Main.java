package com.metanit;

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
        double z=((a-3)*(b/2))+c;
        System.out.println("\nЗначение функции = "+z);
    }
}
