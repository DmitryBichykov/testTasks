package com.metanit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    char[] str={'H','e','l','l','o',' ','w','o','r','d','!',' ','H','e','l','l','o',' ','w','o','r','d','!'};
        System.out.println("Исходная строка:");
        System.out.println(str);
        replace(str);
    }

    private static void replace(char[] letter){
        for (int i=0;i<letter.length-4;i++){
            if (letter[i]=='w' && letter[i+1]=='o' && letter[i+2]=='r' && letter[i+3]=='d'){
                letter= Arrays.copyOf(letter,letter.length+2);
                for(int j=letter.length-1;j>i+3;j--){
                    letter[j]=letter[j-2];
                }
                letter[i]='l';
                letter[i+1]='e';
                letter[i+2]='t';
                letter[i+3]='t';
                letter[i+4]='e';
                letter[i+5]='r';
            }
        }
        System.out.println(letter);
    }
}
