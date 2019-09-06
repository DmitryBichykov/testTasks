package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной n (n - четное число): ");
        int n=scan.nextInt();
        while (n % 2!=0){
            System.out.print("Переменная n должна быть четным числом: ");
            n=scan.nextInt();
        }
        int[][] array=new int[n][n];
        System.out.println("Сформированный массив:");
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++) {
                array[i][j] = i + 1;
                System.out.print(array[i][j]+"\t");
            }
            for(int j=n-i;j<n;j++){
                array[i][j]=0;
                System.out.print(array[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
