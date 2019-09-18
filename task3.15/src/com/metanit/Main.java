package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите несколько предложений:");
        String X=scan.nextLine();
        numberOffers(X);
    }

    private static void numberOffers(String str){
        int numberOffers=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='.' || str.charAt(i)=='!' || str.charAt(i)=='?'){
                numberOffers++;
            }
        }
        System.out.println("Количество предложений в строке - "+numberOffers);
    }
}
