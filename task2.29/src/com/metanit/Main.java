package com.metanit;

public class Main {

    public static void main(String[] args) {
        int maxNumber;
        int maxIndex=0;
	int[] a={-10,-4,0,2,5,16,23,48,67,103};
        System.out.println("Исходная последовательность:");
        for (int i:a){
            System.out.print(i+"\t");
        }
	for (int j=0;j<a.length;j++) {
        maxNumber=a[j];
        for (int i = j; i < a.length; i++) {
            if (maxNumber <= a[i]) {
                maxIndex=i;
                maxNumber=a[i];
            }
        }
        a[maxIndex]=a[j];
        a[j]=maxNumber;
    }
        System.out.println("\nСортировка выбором по убыванию:");
	for (int i:a){
        System.out.print(i+"\t");
    }
    }
}
