package com.metanit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите строку:");
        String line=scan.nextLine();
        longestWord(line);
    }

    private static void longestWord(String str){
        String longestWord=new String() ;
        int maxNumberSigns=0;
        int numberSigns=0;
        str+=" ";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                if (maxNumberSigns<numberSigns){
                    maxNumberSigns=numberSigns;
                    longestWord=str.substring(i-numberSigns,i);
                }
                numberSigns=-1;
            }
            numberSigns++;
        }
        System.out.println("Самое длинное слово в строке: "+longestWord);
    }
}
