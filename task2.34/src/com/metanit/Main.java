package com.metanit;

public class Main {

    public static void main(String[] args) {
	int[] numerator={1,3,9,4,6,7};
	int[] denominator={5,25,10,125,25,500};
        System.out.println("Исходные дроби:");
        int maxDenominator=denominator[0];
        for (int i=0;i<numerator.length;i++){
            System.out.print(numerator[i]+"/"+denominator[i]+"; ");
            if (maxDenominator<denominator[i]){
                maxDenominator=denominator[i];
            }
        }
        for (int i=0;i<denominator.length;i++) {
            if (maxDenominator % denominator[i] != 0) {
                maxDenominator *= denominator[i];
            }
        }
        for (int i=0;i<denominator.length;i++) {
                numerator[i] *= (maxDenominator / denominator[i]);
                denominator[i] = maxDenominator;
            }
        System.out.println("\nПриведем дроби к общему знаменателю:");
        for (int i=0;i<numerator.length;i++){
            System.out.print(numerator[i]+"/"+denominator[i]+"; ");
        }
        int index=0;
        int temp;
        while (index<numerator.length-1){
            if (numerator[index]>numerator[index+1]){
                temp=numerator[index];
                numerator[index]=numerator[index+1];
                numerator[index+1]=temp;
                temp=denominator[index];
                denominator[index]=denominator[index+1];
                denominator[index+1]=temp;
                if (index!=0) {
                    index--;
                }
            }else {
                    index++;
            }
        }
        System.out.println("\nОтсортируем дроби в порядке возрастания элементов:");
        for (int i=0;i<numerator.length;i++){
            System.out.print(numerator[i]+"/"+denominator[i]+"; ");
        }
    }
}
