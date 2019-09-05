package com.metanit;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minNumber;
        int amountNumber=0;
	    Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество целых чисел: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n;i++){
            System.out.print("Введите целое число № "+(i+1)+" :");
            a[i]=scan.nextInt();
        }
        minNumber=a[0];
        for (int i=1; i<n;i++){
            if (minNumber>a[i]){
                minNumber=a[i];
            }else {
                if(minNumber==a[i]){
                    amountNumber++;
                }
            }
        }
        int[] b=new int[n-amountNumber];
        int j=0;
        System.out.println("\nНовая последовательность:");
        for (int i=0;i<n;i++){
           if (a[i]!=minNumber){
               b[j]=a[i];
               System.out.print(b[j]+"; ");
               j++;
           }
        }
    }
}
