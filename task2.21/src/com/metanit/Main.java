package com.metanit;

public class Main {

    public static void main(String[] args) {
        int numberRepetitions;
	int[][] array=new int[10][20];
        System.out.println("Исходная матрица:");
	for (int i=0; i<array.length;i++){
	    for (int j=0;j<array[i].length;j++){
	        array[i][j]=0+(int) (Math.random()*16);
            System.out.print(array[i][j]+"\t");
        }
        System.out.println();
    }
        System.out.print("Число 5 встречается три и более раз в строке(-ах): ");
	for (int i=0;i<array.length;i++){
	    numberRepetitions=0;
	    for (int j=0;j<array[i].length;j++) {
            if (array[i][j] == 5) {
                numberRepetitions++;
            }
        }
	    if (numberRepetitions>=3){
            System.out.print((i+1)+"; ");
        }
    }
    }
}
