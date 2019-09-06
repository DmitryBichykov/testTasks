package com.metanit;

public class Main {

    public static void main(String[] args) {
        int sum;
        int maxSum=0;
        int maxSumColumn=0;
	    int[][] array={{2,3,6,1},{0,4,12,9},{1,25,6,0}};
        System.out.println("Исходная матрица:");
        for (int[] i:array) {
            for(int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<array[0].length;i++){
            sum=0;
            for (int j=0;j<array.length;j++){
                sum+=array[j][i];
            }
            if (maxSum<sum){
                maxSum=sum;
                maxSumColumn=i+1;
            }
            System.out.println("Сумма элементов в столбце № "+(i+1)+" = "+sum);
        }
        System.out.println("В столбце "+maxSumColumn+" максимальная сумма элементов!");
    }
}
