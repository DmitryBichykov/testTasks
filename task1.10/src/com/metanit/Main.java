package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите ширину прямоугольного отверстия: ");
        double A=scan.nextDouble();
        System.out.print("Введите длину прямоугольного отверстия: ");
        double B=scan.nextDouble();
        System.out.print("Введите ширину кирпича: ");
        double x=scan.nextDouble();
        System.out.print("Введите длину кирпича: ");
        double y=scan.nextDouble();
        System.out.print("Введите высоту кирпича: ");
        double z=scan.nextDouble();
        if (A>x && B>y || A>y && B>x || A>y && B>z || A>z && B>y ||A>x && B>z || A>z && B>x){
            System.out.println("Кирпич пройдет через отверстие!");
        }else{
            System.out.println("Кирпич не пройдет через отверстие!");
        }
    }
}
