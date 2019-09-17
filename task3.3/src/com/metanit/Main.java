package com.metanit;

public class Main {

    public static void main(String[] args) {
	char[] str={'H','e','l','l','o',' ','W','o','r','d',' ','2','0','1','9'};
        System.out.println("Исходная строка");
        System.out.println(str);
        numberDigits(str);
    }

    private static void numberDigits(char[] line){
        int number=0;
        for (char i:line){
            if(Character.isDigit(i)){
                number++;
            }
        }
        System.out.println("В строке "+number+" цифры(ер)!");
    }
}
