package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[][] array={{-7,2,1},{3,0,-5},{4,10,3},{0,-2,-7}};
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите номер строки матрицы, который необходимо вывести: ");
        int k=scan.nextInt();
        System.out.print("Введите номер столбца матрицы, который необходимо вывести: ");
        int p=scan.nextInt();
        System.out.println(k+"-ая строка матрицы:");
        for (int i=0;i<array[k-1].length;i++){
            System.out.print(array[k-1][i]+"\t");
        }
        System.out.println("\n"+p+" столбец матрицы:");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i][p-1]);
        }
    }
}
