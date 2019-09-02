package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество числе: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Введите целое число № "+(i+1)+": ");
            a[i]=scan.nextInt();
        }
        System.out.println("Вывожу на печать числа, для которых их номер меньше значения:");
        for (int i=0;i<n;i++){
            if (a[i]>(i+1)){
                System.out.print(a[i]+"; ");
            }
        }
    }
}
