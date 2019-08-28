package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int summ=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите любое целое положительно число: ");
        int number=scan.nextInt();
        for (int i=1;i<=number;i++){
            summ+=i;
        }
        System.out.println("Сумма чисел от 1 до "+number+" = "+summ);
    }
}
