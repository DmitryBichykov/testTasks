package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String number1 = scan.next();
        System.out.print("Введите второе число: ");
        String number2 = scan.next();
        System.out.println("Цифры входящие как в первое, так и второе число:");
        for(int i=0;i<number1.length();i++){
           if(number2.indexOf(number1.charAt(i))!=-1) {
               System.out.print(number1.charAt(i) + "; ");
           }
        }
    }
}
