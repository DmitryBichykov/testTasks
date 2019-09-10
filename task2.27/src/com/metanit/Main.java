package com.metanit;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] array1={-1,3,2,10,0-5,4};
	int[] array2={9,-3,4,2};
        System.out.println("Первый массив:");
        for (int i:array1){
            System.out.print(i+"\t");
        }
        System.out.println("\nВторой массив:");
        for (int i:array2){
            System.out.print(i+"\t");
        }
        System.out.print("\nВведите значение переменной k: ");
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        int j=0;
        array1= Arrays.copyOf(array1,array1.length+array2.length);
       for (int i=k;i<array1.length-array2.length;i++){
            array1[(k+array2.length+j)]=array1[i];
            j++;
        }
       j=0;
       for (int i=k;i<k+array2.length;i++){
            array1[i]=array2[j];
            j++;
       }
       for (int i:array1){
            System.out.print(i+"\t");
        }
    }
}
