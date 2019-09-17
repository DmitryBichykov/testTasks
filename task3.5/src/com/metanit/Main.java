package com.metanit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	char[] line={' ',' ','H','e','l','l','o',' ',' ',' ','W','o','r','d','!',' ',' ',' ',' '};
        System.out.println("Исходная строка:");
        System.out.println(line);
        removeExtraSpaces(line);
    }

    private static void removeExtraSpaces(char[] str){
        int i=0;
        if (str[0]==' ') {
            while(str[i]==' ') {
                i++;
            }
            for (int j=i;j<str.length;j++){
                str[j-i]=str[j];
            }
        }
            str= Arrays.copyOf(str,str.length-i);
        i=str.length-1;
        if (str[i]==' '){
            while(str[i]==' ') {
                i--;
            }
            }
            str= Arrays.copyOf(str,i+1);
        for(i=0;i<str.length;i++){
            if(str[i]==' '){
                int j=0;
                while (str[i]==' '){
                    j++;
                    i++;
                }
                for (int q=i;q<str.length;q++){
                    str[q-j+1]=str[q];
                }
                str= Arrays.copyOf(str,str.length-j+1);
            }
        }
        System.out.println(str);
    }
}
