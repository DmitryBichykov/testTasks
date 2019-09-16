package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n=scan.nextInt();
        while (n<=2){
            System.out.print("Число n должно быть больше 2: ");
            n=scan.nextInt();
        }
        twinSearch(n);
    }

    private static void twinSearch(int m){
        System.out.println("Пары <<близнецы>> на промежутке от "+m+" до "+2*m+": ");
        for (int i=m;i<=2*m;i+=2){
            System.out.print(i+"; ");
        }
    }
}
