package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[] numbers=new int[4];
	for (int i=0; i<4;i++){
        System.out.print("Введите натуральное число №"+(i+1)+": ");
        numbers[i]=scan.nextInt();
    }
	largestDivisor(numbers);
    }

    private static void largestDivisor(int[] array){
        int maxDivisor=0;
        for (int i=1;i<=Math.min(Math.min(array[0],array[1]),Math.min(array[2],array[3]));i++){
            if (array[0]%i==0 && array[1]%i==0 && array[2]%i==0 && array[3]%i==0){
                maxDivisor=i;
            }
        }
        System.out.println("Наибольший общий делитель чисел "+array[0]+", "+array[1]+", "+array[2]+", "+array[3]+": "+maxDivisor);
    }
}
