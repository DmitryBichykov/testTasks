package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();
        int[] A=new int[n];
        System.out.print("Введите значение переменной K: ");
        int K = scan.nextInt();
        System.out.println("Массив:");
        for(int i=0;i<n;i++){
            A[i]=(int)(1+Math.random()*99);
            System.out.print(A[i]+"; ");
            if(A[i] % K==0){
                sum+=A[i];
            }
        }
        System.out.println("\nСумма элементов массива кратных "+K+" равна "+ sum);
    }
}
