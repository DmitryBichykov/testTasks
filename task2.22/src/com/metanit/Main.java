package com.metanit;


public class Main {

    public static void main(String[] args) {
	int [][] array=new int[5][7];
	int minNumber;
        System.out.println("Исходная матрица:");
	for (int i=0;i<array.length;i++){
	    for (int j=0;j<array[i].length;j++){
	        array[i][j]=(int)(Math.random()*21)-10;
            System.out.print(array[i][j]+"\t");
        }
        System.out.println();
    }
        System.out.println("Сортировка строк матрицы по воззрастанию значения элементов:");
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                for (int q=j;q<array[i].length;q++){
                    if (array[i][j]>array[i][q]){
                        minNumber=array[i][q];
                        array[i][q]=array[i][j];
                        array[i][j]=minNumber;
                    }
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Сортировка строк матрицы по убыванию значения элементов:");
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                for (int q=j;q<array[i].length;q++){
                    if (array[i][j]<array[i][q]){
                        minNumber=array[i][q];
                        array[i][q]=array[i][j];
                        array[i][j]=minNumber;
                    }
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
