package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n=scan.nextInt();
        int[] array=new int[n];
        for (int i=0; i<n;i++){
            System.out.print("Введите элемент массива № "+(i+1)+": ");
            array[i]=scan.nextInt();
        }
        System.out.println("Преобразованный массив:");
        for (int i=0;i<n;i++){
            if ((i+1)%2==0){
                array[i]=0;
            }
            System.out.print(array[i]+"; ");
        }
    }
}
