package com.metanit;

public class Main {

    public static void main(String[] args) {
	int[][] array={{-5,3,2,-4},{0,-7,9,2},{10,-8,12,3},{-9,-5,4,1}};
	int maxNumber=array[0][0];
		System.out.println("Исходный массив: ");
	for (int[] i:array){
	    for (int j:i){
	        if (j>maxNumber){
	            maxNumber=j;
            }
	        System.out.print(j+"\t");
        }
		System.out.println();
    }
		System.out.println("Новый массив:");
	for (int i=0;i<array.length;i++){
	    for (int j=0;j<array[i].length;j++){
	        if (array[i][j] % 2!=0){
	            array[i][j]=maxNumber;
	        }
			System.out.print(array[i][j]+"\t");
	    }
		System.out.println();
	}
    }
}
