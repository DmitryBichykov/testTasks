package com.metanit.runer;

import com.metanit.draconcave.DragonCave;
import com.metanit.draconcave.HiddenTreasures;
import com.metanit.draconcave.logic.HiddenTreasuresLogic;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
	    DragonCave dragonCave=new DragonCave();
        HiddenTreasuresLogic logic=new HiddenTreasuresLogic();
        logic.openBaseHiddenTreasures(dragonCave);
        System.out.println("Выберите необходимое действие:");
        int operation=0;
        while(operation!=4) {
            System.out.println("1. Просмотреть все сокровища дракона;\n2. Показать самое дорогое по стоимости сокровище;\n" +
                    "3. Выбрать сокровища на заданную сумму;\n4. Законсить раоту с программой.");
            operation=scan.nextInt();
            if (operation==1){
                System.out.println("====================================");
                for (HiddenTreasures i:dragonCave.getHiddenTreasures()) {
                    System.out.printf("%-25s%8.2f $\n", i.getName(), i.getCost());
                }
                System.out.println("====================================");
            }
            if (operation==2){
                System.out.println("Самое дорогое сокровище в колекции дракона:");
                System.out.printf("%-25s%8.2f $\n",logic.findMostExpensiveHiddenTreasures(dragonCave).getName(),logic.findMostExpensiveHiddenTreasures(dragonCave).getCost());
            }
            if (operation==3){
                System.out.print("Введите сумму: ");
                double sum=scan.nextDouble();
                DragonCave dragonCave1=logic.treasureSelectionInAmountOf(sum,dragonCave);
                double totalAmount=0;
                System.out.println("На данноу сумму подобранно следующее сокровище:");
                System.out.println("====================================");
                for (HiddenTreasures i:dragonCave1.getHiddenTreasures()) {
                    System.out.printf("%-25s%8.2f $\n", i.getName(), i.getCost());
                    totalAmount+=i.getCost();
                }
                System.out.println("====================================");
                System.out.printf("%-25s%8.2f $\n","ИТОГО:",totalAmount);
            }
            if (operation>4) System.out.println("Вы ввели недопустимое значение!");
        }
    }
}
