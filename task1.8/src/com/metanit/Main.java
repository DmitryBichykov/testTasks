package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной a: ");
        double a=scan.nextDouble();
        System.out.print("Введите значение переменной b: ");
        double b=scan.nextDouble();
        System.out.print("Введите значение переменной c: ");
        double c=scan.nextDouble();
        System.out.print("Введите значение переменной d: ");
        double d=scan.nextDouble();
        System.out.print("Ответ: "+Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
