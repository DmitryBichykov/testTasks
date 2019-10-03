package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        DecimalCounter counter=new DecimalCounter(0,0,0);
        System.out.print("Введите нижнюю границу счетчика: ");
        int minNumber=scan.nextInt();
        System.out.print("Введите верхнюю границу счетчика: ");
        int maxNumber=scan.nextInt();
        System.out.println("Как произвести инициализацию счетчика?");
        System.out.println("1. Значение по умолчанию;\n2. Произвольное значение.");
        int operation=scan.nextInt();
        if (operation==1){
            counter = new DecimalCounter(minNumber, maxNumber,0);
        }
        if (operation==2) {
            counter = new DecimalCounter(minNumber, maxNumber);
        }
        if (operation>2 || operation<1) System.out.println("Вы ввели недоспустимое значение!");
        System.out.println("Выберите необходимую операцию (ввести номер операции):");
        System.out.println("1. Вывести текущее значение счетчика;\n2. Запустить счетчик с увеличением;\n3. Запустить счетчик с уменьшением.");
        operation=scan.nextInt();
        if (operation>3 || operation<1) System.out.println("Вы ввели недопустимое значение!");
        else {
            if (operation==1) System.out.println("Текущее значение счетчика: "+counter.getCount());
            if (operation==2) {
                while (counter.getCount()<maxNumber) {
                    counter.increase();
                    System.out.println(counter.getCount());
                }
            }
            if (operation==3) {
                while (counter.getCount()>minNumber) {
                    counter.decrease();
                    System.out.println(counter.getCount());
                }
            }
        }
    }
}

class DecimalCounter{
    private int minNumber;
    private int maxNumber;
    private int count;

    public DecimalCounter(int minNumber,int maxNumber,int count){
        this.minNumber=minNumber;
        this.maxNumber=maxNumber;
        this.count=count;
    }

    public DecimalCounter(int minNumber,int maxNumber){
        this.minNumber=minNumber;
        this.maxNumber=maxNumber;
        this.count=this.minNumber+(int)(Math.random()*(this.maxNumber-this.minNumber+1));
    }

    public int getCount(){
        return count;
    }

    public void increase(){
        count++;
    }

    public void decrease(){
        count--;
    }

}
