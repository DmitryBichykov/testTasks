package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Задайте любое натуральное число: ");
        int number=scan.nextInt();
        subtractionNumbers(number);
    }

    private static void subtractionNumbers(int n){
        int quantity=0;
        int sum;
        while (n!=0){
            sum=0;
            for (int i=0;i<Integer.toString(n).length();i++){
                sum+=Integer.parseInt(Integer.toString(n).substring(i,i+1));
            }
            System.out.print(n+"; ");
            n-=sum;
            quantity++;
        }
        System.out.println("\nЧтобы из числа получить ноль необходимо произвести "+quantity+" вычитаний(е)!");
    }
}
