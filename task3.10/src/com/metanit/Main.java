package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите строку:");
        String line=scan.nextLine();
        int numberSigns= line.length()-line.replaceAll("a","").length();
        System.out.println("Буква а встречается в строке "+numberSigns+" раз(а)!");
    }
}
