package com.metanit;

import java.util.Arrays;

public class Client {
    private String nameClient;
    private Account[] accounts=new Account[0];
    int index = 0;

    public Client(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setAccounts(Account accounts) {
        this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
        this.accounts[index]=new Account(accounts.getNumberAccount(),accounts.getAccountAmount(),accounts.isAccountLock());
        index++;
    }

    public void findAccount(int numberAccount){
        for (Account i:accounts) {
            if (i.getNumberAccount()==numberAccount) {
                System.out.println("Сумма счета = "+i.getAccountAmount());
                break;
            }
        }
    }

    public void sortAccount(){
        int i=0;
        while (i<accounts.length-1){
            if (accounts[i].getNumberAccount()<=accounts[i+1].getNumberAccount()) i++;
            else {
                int temp=accounts[i].getNumberAccount();
                double temp2=accounts[i].getAccountAmount();
                boolean temp3=accounts[i].isAccountLock();
                accounts[i].setNumberAccount(accounts[i+1].getNumberAccount());
                accounts[i].setAccountAmount(accounts[i+1].getAccountAmount());
                accounts[i].setAccountLock(accounts[i+1].isAccountLock());
                accounts[i+1].setNumberAccount(temp);
                accounts[i+1].setAccountAmount(temp2);
                accounts[i+1].setAccountLock(temp3);
                if(i!=0) i--;
            }
        }
        getClient();
    }

    public void lockAccount(int numberAccount){
        for (Account i:accounts) {
            if (i.getNumberAccount()==numberAccount) {
                i.setAccountLock(true);
                break;
            }
        }
    }

    public void unlockAccount(int numberAccount){
        for (Account i:accounts) {
            if (i.getNumberAccount()==numberAccount) {
                i.setAccountLock(false);
                break;
            }
        }
    }

    public void totalInvoiceAmount(){
        double totalInvoiceAmount=0;
        for(Account i:accounts){
            if (!i.isAccountLock()) totalInvoiceAmount+=i.getAccountAmount();
        }
        System.out.printf("Общая сумма по всем счетам составляет %.2f\n",totalInvoiceAmount);
    }

    public void invoiceAmountSeparately(){
        double positiveAmounts=0;
        double negativeAmounts=0;
        for(Account i:accounts){
            if (!i.isAccountLock()) {
                if (i.getAccountAmount() > 0) positiveAmounts += i.getAccountAmount();
                else negativeAmounts += i.getAccountAmount();
            }
        }
        System.out.printf("Сумма по положительным счетам %.2f\t|\t по отрицательным счетам -%.2f\n",positiveAmounts,negativeAmounts);
    }

    public void getClient() {
        System.out.printf("ФИО клиента: %S\n",nameClient);
        for (Account i:accounts) {
            System.out.printf("Номер счета: %d\t|\tСумма счета: %.2f", i.getNumberAccount(), i.getAccountAmount());
            if (i.isAccountLock()) System.out.println("\t|\t счет заблокирован");
            else System.out.println();
        }
    }
}
