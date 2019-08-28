package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение m: ");
        int m=scan.nextInt();
        System.out.print("Введите значение n: ");
        int n=scan.nextInt();
        for (int i=m;i<=n;i++){
            System.out.print("\nДелители числа "+i+" : ");
            for(int j=2;j<i;j++){
                if(i % j==0){
                    System.out.print(j+"; ");
                }
            }
        }
    }
}
