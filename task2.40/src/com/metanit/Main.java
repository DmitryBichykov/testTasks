package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число №" + (i + 1)+": ");
            numbers[i]=scan.nextInt();
        }
        reciprocityCheck(numbers);
    }

    private static void reciprocityCheck(int[] array){
        int numberDividers=0;
        for (int i=1;i<=Math.min(Math.min(array[0],array[1]),array[2]);i++){
            if (array[0]%i==0 && array[1]%i==0 && array[2]%i==0){
             numberDividers++;
            }
        }
        if (numberDividers==1){
            System.out.println("Данные числа являются взаимно простыми!");
        }else System.out.println("Данные числа не являются взаимно простыми!");
    }
}
