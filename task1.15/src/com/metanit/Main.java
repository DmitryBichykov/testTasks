package com.metanit;

public class Main {

    public static void main(String[] args) {
        int multi=1;
	    for (int i=1;i<=200;i++){
            multi*=Math.pow(i,2);
	    }
        System.out.println("Прозведение квадратов первых 200 чисел равно "+multi);
    }
}
