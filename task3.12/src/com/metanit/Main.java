package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите строку:");
        String line=scan.nextLine();
        line=removeDuplicateCharactersSpaces(line);
        System.out.println("Отформатированная строка:"+"\n"+line);
    }

    private static String removeDuplicateCharactersSpaces(String str){
        str=str.replaceAll(" ","");
        StringBuilder sb=new StringBuilder(str);
        for (int i=0;i<sb.length();i++){
            for (int j=i+1;j<sb.length();j++){
                if (sb.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }
        return sb.toString();
    }
}
