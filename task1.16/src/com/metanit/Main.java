package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Количество членов в ряду n=");
        int n=scan.nextInt();
        System.out.print("Введите значение переменной e: ");
        double e=scan.nextDouble();
        System.out.println("Члены ряда:");
        for (int i=1;i<=n;i++){
            System.out.print((1/Math.pow(2,i)+1/Math.pow(3,i))+"; ");
            if (e<=(1/Math.pow(2,i)+1/(Math.pow(3,i)))){
                sum+=(1/Math.pow(2,i)+1/(Math.pow(3,i)));
            }
        }
        System.out.println("\nСумма членов ряда больших или равных переменной е по модулю = "+sum);
    }
}
