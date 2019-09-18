package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите строку:");
	    String line=scan.nextLine();
	    mostSpaces(line);
    }

    private static void mostSpaces(String str){
        int mostSpaces=0;
        int successivelySpaces=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                successivelySpaces=0;
                while (str.charAt(i)==' ' && i!=str.length()-1) {
                    successivelySpaces++;
                    i++;
                }
            }
            if (mostSpaces<(successivelySpaces)){
                mostSpaces=successivelySpaces;
            }
        }
        System.out.println("Максимальное количество подряд идущих пробелов в строке равно "+mostSpaces);
    }
}
