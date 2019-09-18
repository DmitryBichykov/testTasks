package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите строку:");
        String line=scan.nextLine();
        String newLine=duplicationEachCharacter(line);
        System.out.println("Новая строка:"+"\n"+newLine);
    }

    private static String duplicationEachCharacter(String str){
        StringBuilder sb=new StringBuilder(str);
        for (int i=0;i<sb.length();i+=2){
            sb.insert(i+1,sb.charAt(i));
        }
        return sb.toString();
    }
}
