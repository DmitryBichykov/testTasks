package com.metanit;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[5][7];
        int minNumber;
        System.out.println("Исходная матрица:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 21) - 10;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //Сортировка по возрастанию
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                for (int q = i; q < array.length; q++) {
                    if (array[i][j] > array[q][j]) {
                        minNumber = array[q][j];
                        array[q][j] = array[i][j];
                        array[i][j] = minNumber;
                    }
                }
            }
        }
        System.out.println("Сортировка строк матрицы по воззрастанию значения элементов:");
        for (int[] i:array){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        //Сортировка строк по убыванию
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                for (int q = i; q < array.length; q++) {
                    if (array[i][j] < array[q][j]) {
                        minNumber = array[q][j];
                        array[q][j] = array[i][j];
                        array[i][j] = minNumber;
                    }
                }
            }
        }
        System.out.println("Сортировка строк матрицы по убыванию значения элементов:");
        for (int[] i:array){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
