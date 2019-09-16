package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.print("Введите значение переменной n: ");
        int n=scan.nextInt();
        numberSum(n);
    }

    private static void numberSum(int k){
        String number="1";
        int sum=0;
        boolean oddNumber;
        for (int i = 1; i < k; i++) {
            number+=Integer.toString(0);
        }
        while (number.length()==k) {
            oddNumber=true;
          for (int i=0;i<k;i++){
              if (Integer.parseInt(number.substring(i,i+1)) % 2==0){
                  oddNumber=false;
              }
          }
          if (oddNumber==true) {
              System.out.print(number+"; ");
              sum+=Integer.parseInt(number);
          }
          number=Integer.toString(Integer.parseInt(number)+1);
        }
        System.out.println("\nСумма данных чисел = "+sum);
        int quantity=0;
        System.out.print("Количество четных цифр в сумме = ");
        for(int i=0;i<Integer.toString(sum).length();i++){
           if(Integer.parseInt(Integer.toString(sum).substring(i,i+1)) % 2==0){
               quantity++;
           }
        }
        System.out.println(quantity);
    }
}
