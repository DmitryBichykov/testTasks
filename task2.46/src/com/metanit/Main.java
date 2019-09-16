package com.metanit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите натуральное число K: ");
        int K=scan.nextInt();
        System.out.print("Введите натуральное число N: ");
        int N=scan.nextInt();
        arrayFormation(K,N);
    }

    private static void arrayFormation(int number1,int number2){
        int[] A=new int[0];
        int sum=0;
        int numberArray=number1+1;
        while (sum!=number1){
            A=Arrays.copyOf(A,A.length+1);
            while((numberArray+sum)>number1) {
                numberArray = 1 + (int) (Math.random() * number2);
            }
            sum+=numberArray;
            A[A.length-1]=numberArray;
        }
        System.out.println("Массив:");
        for (int i:A){
            System.out.print(i+"; ");

        }
    }
}
