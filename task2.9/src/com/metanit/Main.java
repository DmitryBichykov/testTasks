package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int frequentNumber=0;
        int frequentNumber2=0;
        int repetitionsNumber;
        int repetitionsNumber2=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n=scan.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Введите элемент массива № "+(i+1)+": ");
            array[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            repetitionsNumber=0;
            for (int j=0;j<n;j++) {
                if (array[i] == array[j]) {
                    repetitionsNumber++;
                    frequentNumber = array[j];
                }
            }
                if (repetitionsNumber2<repetitionsNumber){
                    repetitionsNumber2=repetitionsNumber;
                    frequentNumber2=frequentNumber;
                }
                if(repetitionsNumber2==repetitionsNumber){
                    if(frequentNumber2>frequentNumber){
                        frequentNumber2=frequentNumber;
                    }
                }
        }
        System.out.println("Минимальное из наиболее часто встречаеющихся чисел: "+frequentNumber2);

    }
}
