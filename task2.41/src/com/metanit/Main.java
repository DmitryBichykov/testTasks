package com.metanit;

public class Main {

    public static void main(String[] args) {
        int sum=0;
	for (int i=1;i<=9;i++){
	    if (i % 2 !=0){
        sum+=factorial(i);
        }
    }
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна "+sum);
    }

    private static int factorial(int number){
        int factorial=1;
        for (int i=1;i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }
}
