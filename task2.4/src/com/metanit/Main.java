package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double maxNumber;
        int maxIndex=0;
        double minNumber;
        int minIndex=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество действительных чисел: ");
        int n = scan.nextInt();
        double[] a=new double[n];
        for (int i=0;i<n;i++) {
            System.out.print("Введите действительное число № " + (i + 1) + ": ");
            a[i] = scan.nextDouble();
        }
        maxNumber=a[0];
        minNumber=a[0];
        for (int i=0;i<n;i++){
            if(a[i]>maxNumber){
                maxNumber=a[i];
                maxIndex=i;
            }
            if(a[i]<minNumber){
                minNumber=a[i];
                minIndex=i;
            }
        }
        a[minIndex]=maxNumber;
        a[maxIndex]=minNumber;
        System.out.println("Меняю местами наибольший и наименьший элементы ряда:");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+"; ");
        }
    }
}
