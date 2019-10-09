package com.metanit;

public class Account {
    private int numberAccount;
    private double accountAmount;
    private boolean accountLock;

    public Account(int numberAccount, double accountAmount,boolean accountLock) {
        this.numberAccount = numberAccount;
        this.accountAmount = accountAmount;
        this.accountAmount=accountAmount;
    }

    public void setAccountLock(boolean accountLock) {
        this.accountLock = accountLock;
    }

    public boolean isAccountLock() {
        return accountLock;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }
}
