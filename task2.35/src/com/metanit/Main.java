package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.print("Введите натуральное число A: ");
        int a=scan.nextInt();
        System.out.print("Введите натуральное число B: ");
        int b=scan.nextInt();
        largestDivisor(a,b);
        leastMultiple(a,b);
    }

    private static void largestDivisor(int x, int y){
        int maxDivisor=0;
        for (int i=1; i<=Math.min(x,y);i++){
            if ((x % i==0) && (y % i==0)){
                maxDivisor=i;
            }
        }
        System.out.println("Наибольший общий делитель чисел "+x+" и "+y+": "+maxDivisor);
    }

    private static void leastMultiple(int x,int y){
        int minMultiple=Math.max(x,y);
        while((minMultiple % x!=0) || (minMultiple % y!=0)){
            minMultiple++;
        }
        System.out.println("Наименьшее общее кратное чисел "+x+" и "+y+": "+minMultiple);
    }
}
