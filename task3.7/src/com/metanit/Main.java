package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = scan.nextLine();
        line=characterInsertion(line);
        System.out.println(line);
    }

    private static String characterInsertion(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            if (sb.charAt(i)=='a'){
               sb.insert(i+1,'b');
            }
        }
        return sb.toString();
    }
}
