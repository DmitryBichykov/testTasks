package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите первый угол треугольника: ");
        int angle1=scan.nextInt();
        System.out.print("Введите второй угол треугольника: ");
        int angle2=scan.nextInt();
        if (180-(angle1+angle2)>0){
            System.out.print("Данный треугольник существует");
            if((180-(angle1+angle2)==90) || angle1==90 ||angle2==90){
                System.out.println(" и он прямоугольный!");
            }
        }else{
            System.out.println("Данный треугольник не существует!");
        }
    }
}
