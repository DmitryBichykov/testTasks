package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n=scan.nextInt();
    int[] D=new int[n];
        System.out.println("Массив:");
    for (int i=0;i<n;i++){
        D[i]=(int)(Math.random()*201)-100;
        System.out.print(D[i]+"\t");
    }
        System.out.println();
    Sum(D);
    }

    private static void Sum(int[] array){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной k: ");
        int k=scan.nextInt()-1;
        System.out.print("Введите значение переменной m: ");
        int m=scan.nextInt()-1;
        for (int i=k;i<=m-2;i++) {
            int sum=array[i]+array[i+1]+array[i+2];
            System.out.println(array[i]+"+"+array[i+1]+"+"+array[i+2]+"="+sum);
        }
    }
}
