package com.metanit;

public class Main {

    public static void main(String[] args) {
        Payment.Good good1=new Payment.Good("Телевизор",1200);
        Payment.Good good2=new Payment.Good("Холодильник",1800);
        Payment.Good good3=new Payment.Good("Стиральная машина",850);
        Payment.Good good4=new Payment.Good("Ноутбук",2540.50);
	    Payment payment1=new Payment();
	    payment1.addGoods(good1);
	    payment1.addGoods(good2);
	    payment1.addGoods(good3);
	    payment1.addGoods(good4);
        new PurchaseReceipt().purchaseReceipt(payment1);
    }
}
