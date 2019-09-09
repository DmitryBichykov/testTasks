package com.metanit;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество строк в матрице: ");
        int m=scan.nextInt();
        System.out.print("Введите количество столбцов в матрице: ");
        int n=scan.nextInt();
        int[][] array=new int[m][n];
        for (int j=0;j<array[0].length;j++){
            for (int i=0;i<array.length;i++){
                array[i][j]=0;
            }
            for (int q=0;q<=j;q++){
                array[q][j]=1;
            }
        }
        for (int[] i:array){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
}
