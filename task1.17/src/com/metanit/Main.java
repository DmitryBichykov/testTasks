package com.metanit;

import javafx.scene.SceneAntialiasing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите символ!");
        char character=scan.next().charAt(0);
        int asii=(int) character;
            System.out.println(asii);


    }
}
