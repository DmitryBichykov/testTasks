package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temp;
	    int[][] array={{3,-2,4,6},{0,7,9,-3},{-5,4,3,1},{0,9,7,6}};
        Scanner scan=new Scanner(System.in);
        System.out.println("Первоначальная матрица:");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Введите номера столбцов, которые необходимо поменять местами:");
        int column1=scan.nextInt()-1;
        int column2=scan.nextInt()-1;
        for (int i=0;i<array.length;i++){
            temp=array[i][column1];
            array[i][column1]=array[i][column2];
            array[i][column2]=temp;
        }
        System.out.println("Новый массив:");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
