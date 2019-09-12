package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n=scan.nextInt();
        int[] A=new int[n];
        System.out.println("Массив:");
        for (int i=0;i<n;i++){
            A[i]=(int)(Math.random()*201)-100;
            System.out.print(A[i]+"; ");
        }
        searchNumber(A);
    }

    private static void searchNumber(int[] B){
        int maxNumber=-100;
        int maxNumber2=-100;
        for (int i:B){
            if (maxNumber<i){
                maxNumber=i;
            }
        }
        for (int i:B){
            if (maxNumber2<i && i!=maxNumber){
                maxNumber2=i;
            }
        }
        System.out.print("\nВторое по величине число в массиве: "+maxNumber2);
    }
}
