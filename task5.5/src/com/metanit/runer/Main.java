package com.metanit.runer;

import com.metanit.flowercomposition.FlowerComposition;
import com.metanit.logics.Logic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlowerComposition flowerComposition=new FlowerComposition();
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество видов цветов в композиции: ");
        boolean bool=false;
        int numberFlowers = 0;
        while (!bool) {
            String line = scan.nextLine();
            bool = Logic.checkingFlowersInput(line);
            if (bool) numberFlowers = Integer.parseInt(line);
            else System.out.println("Необходимо ввести целое неотрицательно число!");
        }
        for (int i=0;i<numberFlowers;i++) {
            System.out.print("Введите название цветов "+(i+1)+"-го вида: ");
            boolean bool1=false;
            while (!bool1) {
                String nameFlower = scan.nextLine();
                bool1 = Logic.checkingName(nameFlower);
                if (bool1) flowerComposition.addFlowers(new FlowerComposition.Flowers(nameFlower));
                else System.out.println("Вы ввели недопустимое значение!");
            }
        }
        System.out.print("Введите тип упаковки: ");
        boolean bool2=false;
        while (!bool2) {
            String packageName = scan.nextLine();
            bool2= Logic.checkingName(packageName);
            if (bool2) flowerComposition.addPackaging(new FlowerComposition.Packaging(packageName));
            else System.out.println("Вы ввели недопустимое значение!");
        }
        flowerComposition.showFlowerComposition();
    }
}
