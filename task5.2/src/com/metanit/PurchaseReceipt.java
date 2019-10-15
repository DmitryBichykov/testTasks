package com.metanit;

public class PurchaseReceipt {

    public void purchaseReceipt(Payment payment){
        System.out.println("=======================================");
        for (Payment.Good i:payment.getGoods()) {
            System.out.printf("%-25S%10.2f р.\n", i.getName(),i.getCost());
        }
        System.out.println("=======================================");
        System.out.printf("%-25s%10.2f р.\n","ИТОГО:",payment.getCostGoods());
    }
}

