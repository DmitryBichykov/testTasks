package com.metanit;

public class Main {

    public static void main(String[] args) {
	int[][] array={{1,-4,8},{0,3,-2},{-7,3,1}};
        System.out.println("Элементы стоящие на диагонали матрицы");
	for (int i=0;i<array.length;i++){
	    for(int j=0;j<array[i].length;j++){
	        if (i==j){
                System.out.print(array[i][j]+"; ");
            }
        }
    }
    }
}
