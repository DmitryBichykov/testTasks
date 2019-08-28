package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=Math.pow(i,2);
        }
        System.out.println("Сумма квадратов первых 100 чисел равна "+sum);
    }
}
