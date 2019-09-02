package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum=0;
        int numberDividers;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество числе: ");
        int n=scan.nextInt();
        double[] array=new double[n];
        for (int i=0;i<n;i++){
            System.out.print("Введите вещественно число № "+(i+1)+": ");
            array[i]=scan.nextDouble();
            if((i+1)>1) {
                numberDividers=1;
                for (int j = 2; j <= (i+1); j++) {
                    if((i+1) % j==0){
                        numberDividers++;
                    }
                }
                if(numberDividers==2) {
                    sum+=array[i];
                 }
            }
        }
        System.out.println("Сумма чисел с простым порядковым номером = "+sum);
    }
}
