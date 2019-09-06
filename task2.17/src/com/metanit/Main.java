package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int posSum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n=scan.nextInt();
        double[][] A=new double[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                A[i][j]=Math.round(Math.sin((Math.pow(i,2)-Math.pow(j,2))/n)*100.0)/100.0;
                System.out.print(A[i][j]+"\t\t");
                if (A[i][j]>0){
                    posSum++;
                }
            }
            System.out.print("\n");
        }
        System.out.println("Количество положительных элементов в матрице:"+posSum);
    }
}
