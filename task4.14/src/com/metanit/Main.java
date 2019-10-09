package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	    Client client1=new Client("Иванов И.И.");
        Account account1=new Account(100100,1500,false);
	    client1.setAccounts(account1);
        Account account2=new Account(100200,3500,false);
        client1.setAccounts(account2);
        Account account3=new Account(99800,1500,false);
        client1.setAccounts(account3);
        Account account4=new Account(99999,-4500,false);
        client1.setAccounts(account4);
        client1.getClient();
        int operation=0;
        while (operation!=6) {
            System.out.println("Операция со счетом:");
            System.out.println("1. Произвести поиск счета;\n2. Реализовать сортировку счетов;\n3. Вычислить сумму по счетам;\n" +
                    "4. Разблокировать счет;\n5. Заблокировать счет;\n6. Закончить работу с программой.");
            operation=scan.nextInt();
            if (operation==1){
                System.out.print("Введите номер счета:");
                int numberAccount=scan.nextInt();
                client1.findAccount(numberAccount);
            }
            if (operation==2){
                client1.sortAccount();
            }
            if (operation==3){
                System.out.println("1. Вычислить общую сумму по счетам;\n2. Вычислить сумму по положительным и отрицательным счетам отдельно.");
                 int operation2=scan.nextInt();
                 if (operation2==1){
                     client1.totalInvoiceAmount();
                }
                if (operation2==2){
                    client1.invoiceAmountSeparately();
                }
            }
            if (operation==4){
                client1.getClient();
                System.out.print("Введите номер счета, который необходимо разблокировать:");
                int numberAccount=scan.nextInt();
                client1.unlockAccount(numberAccount);
            }
            if (operation==5){
                client1.getClient();
                System.out.print("Введите номер счета, который необходимо заблокировать:");
                int numberAccount=scan.nextInt();
                client1.lockAccount(numberAccount);
            }
            if (operation>6) System.out.println("Вы ввели недопустимое значение!");
        }
    }
}
