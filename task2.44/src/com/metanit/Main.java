package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int N=scan.nextInt();
        arrayFormation(N);
    }

    private static void arrayFormation(int number){
        String  n= Integer.toString (number);
        System.out.println("Массив:");
        int[] array=new int[n.length()];
        for (int i=0;i<array.length;i++){
            array[i]= Integer.parseInt(n.substring(i,i+1));
            System.out.print(array[i]+"; ");
        }
    }
}
