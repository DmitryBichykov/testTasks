package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberPos=0;
        int numberNeg=0;
        int numberNul=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();
        double[] array=new double[n];
        System.out.println("Массив:");
        for (int i=0;i<n;i++){
            array[i]=Math.random()*201.0-100.0;
            System.out.print(Math.round(array[i]*100.0)/100.0+"; ");
            if (array[i]>0){
                numberPos++;
            }
            if (array[i]<0){
                numberNeg++;
            }
            if(array[i]==0) {
                numberNul++;
            }
        }
        System.out.println("\nКоличество положительных чисел: "+numberPos);
        System.out.println("Количество отрицательных чисел: "+numberNeg);
        System.out.println("Количество нулей: "+numberNul);
    }
}
