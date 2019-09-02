package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество последовательных чисел: ");
        int n = scan.nextInt();
        double[] a=new double[n];
        for(int i=0;i<n;i++){
            System.out.print("Введите действительно число № "+(i+1)+": ");
            a[i] = scan.nextDouble();
        }
        System.out.print("Введите переменную Z: ");
        double Z = scan.nextDouble();
        System.out.println("Новая последовательность действительных чисел:");
        for (int i=0;i<n;i++){
            if(a[i]>Z) {
                a[i]=Z;
                sum++;
            }
            System.out.print(a[i]+"; ");
        }
        System.out.println("\nКоличество произведенных замен: "+sum);
    }
}
