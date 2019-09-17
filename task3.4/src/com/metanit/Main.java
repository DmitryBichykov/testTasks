package com.metanit;

public class Main {

    public static void main(String[] args) {
        char[] str={'2','0',' ', 'H','e','l','l','o',' ','W','o','r','d',' ','2','0','1','9',' ','w','a','i','t',' ','2','0','2','0'};
        System.out.println("Исходная строка");
        System.out.println(str);
        numberDigits(str);
    }

    private static void numberDigits(char[] line){
        int number=0;
        int i=0;
        while (i<line.length) {
            if (Character.isDigit(line[i])) {
                    number++;
                    while(line[i]!=' ' && i!=line.length-1){
                        i++;
                    }
            }
            i++;
        }
        System.out.println("В строке "+number+" числа(ел)!");
    }
}
