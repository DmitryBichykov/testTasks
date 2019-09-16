package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной n: ");
        int n=scan.nextInt();
        while (n<2){
            System.out.print("Переменная n должна быть больше либо равна 2: ");
            n=scan.nextInt();
        }
        increasingSequence(n);
    }

    private static void increasingSequence(int k){
        String number="";
        int max;
        boolean increasing;
        for (int i = 1; i <= k; i++) {
            number+=Integer.toString(i);
        }
        while (number.length()==k) {
            max=Integer.parseInt(number.substring(0,1));
            increasing=true;
            for (int i=1;i<k;i++){
                if (Integer.parseInt(number.substring(i,i+1))<=max){
                    increasing=false;
                }else {
                    max=Integer.parseInt(number.substring(i,i+1));
                }
            }
            if (increasing==true) {
                System.out.print(number + "; ");
            }
            number=Integer.toString(Integer.parseInt(number)+1);
        }
    }
}
