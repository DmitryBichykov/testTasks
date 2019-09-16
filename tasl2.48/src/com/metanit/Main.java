package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение числа k: ");
        int k=scan.nextInt();
        ArmstrongNumbersSearch(k);
    }

    private static void ArmstrongNumbersSearch(int n){
        int length;
        System.out.println("Числа Армстронга: ");
        for (int i=1;i<=n;i++){
            int sum=0;
            length=Integer.toString(i).length();
            for (int j=0;j<length;j++) {
                sum+=Integer.parseInt(Integer.toString(i).substring(j,j+1));
            }
            if (Math.pow(sum,length)==i){
                System.out.print(i+"; ");
            }
        }


    }
}
