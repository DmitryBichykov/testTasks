package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите любое слово:");
        String word=scan.nextLine();
        palindromeCheck(word);
    }

    private static void palindromeCheck(String palindrome){
        StringBuilder sb=new StringBuilder(palindrome);
        if(palindrome.equals(sb.reverse().toString())){
            System.out.println("Данное слово палиндром!");
        }else System.out.println("Данное слово не палиндром!");
    }
}
