package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Test1 test=new Test1();
    test.setNumbers();
    test.getNumbers();
    test.sumNumbers();
    test.maxNumber();
    }
}

class Test1{
    private int number1;
    private int number2;

    void setNumbers(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите число № 1: ");
        number1=scan.nextInt();
        System.out.print("Введите число № 2: ");
        number2=scan.nextInt();
    }

    void getNumbers(){
        System.out.println("Число №1="+number1+"; число №2="+number2);
    }

    void sumNumbers(){
        System.out.println("Сумма значений переменных равна "+(number2+number1));
    }

    void maxNumber(){
        System.out.println("Наибольшее значение из двух переменных: "+Math.max(number1,number2));
    }
}
