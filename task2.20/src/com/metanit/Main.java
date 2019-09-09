package com.metanit;

public class Main {

    public static void main(String[] args) {
	int[][] array={{3,-4,2,0},{1,-7,-3,1},{8,-9,0,-2},{4,-3,4,1}};
        System.out.println("Исходный массив:");
        for (int[] i:array){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.print("Положительные элементы главной диагонали:");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (i==j && array[i][j]>0){
                    System.out.print(array[i][j]+"; ");
                }
            }
        }
    }
}
