package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.print("Введите число №1: ");
        int number1=scan.nextInt();
        System.out.print("Введите число №2: ");
        int number2=scan.nextInt();
        maxLengthNumber(number1,number2);
    }

    private static void maxLengthNumber(int n1,int n2){
        if(Integer.toString(n1).length()>Integer.toString(n2).length()){
            System.out.println("Цифр больше в числе №1!");
        }else if(Integer.toString(n1).length()<Integer.toString(n2).length()){
            System.out.println("Цифр больше в числе №2!");
        }else System.out.println("Количество цифр в обоих числах одинаково!");
    }
}
