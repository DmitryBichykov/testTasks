package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Введите строку:");
        String line=scan.nextLine();
        letterCaseCounting(line);
    }

    private static void letterCaseCounting(String str){
        int upperCase=0;
        int lowerCase=0;
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                upperCase++;
            }
            if (Character.isLowerCase(str.charAt(i))){
                lowerCase++;
            }
        }
        System.out.println("В строке количество строчных букв равно "+lowerCase+"; количество прописных букв - "+upperCase);
    }
}
