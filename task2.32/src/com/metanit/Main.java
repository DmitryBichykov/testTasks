package com.metanit;

public class Main {

    public static void main(String[] args) {
	int[] a={-4,2,0,-10,19,25,4,-9,0,12,48};
        System.out.println("Исходный массив:");
        for (int i:a){
            System.out.print(i+"\t");
        }
	int temp;
	int index=0;
	while (index<=(a.length-2)){
	 if (a[index]<=a[index+1]){
	     index++;
     }else if (a[index]>a[index+1]){
	     temp=a[index];
	     a[index]=a[index+1];
	     a[index+1]=temp;
	     if (index!=0){
	        index--;
	     }
     }
    }
        System.out.println("\nСортировка по возрастанию методом Шелла:");
        for (int i:a){
            System.out.print(i+"\t");
        }
    }
}
