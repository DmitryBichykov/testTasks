package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите действительное число в формате nnn.ddd: ");
        String R=scan.next();
        int pos=R.indexOf(".");
        R=R.substring(pos+1,R.length())+"."+R.substring(0,pos);
        System.out.print("Преобразованная строка: "+R);
    }
}
