package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double f;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной x: ");
        double x=scan.nextDouble();
        if (x<=3){
           f=Math.pow(x,2)-3*x+9;
        }else{
            f=1/(Math.pow(x,3)+6);
        }
        System.out.println("Значение функции F(x)="+f);
    }
}
