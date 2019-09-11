package com.metanit;

public class Main {

    public static void main(String[] args) {
        int maxNumber;
        int numberTransfers=0;
	int[] a={123,98,67,54,32,19,15,6,2,0,-4,-10,-15};
        System.out.println("Исходная последовательность:");
        for (int i:a){
            System.out.print(i+"\t");
        }
        for (int j=0;j<a.length;j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    maxNumber = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = maxNumber;
                    numberTransfers++;
                }
            }
        }
            System.out.println("\nСортировка обменами по возрастанию:");
            for (int i : a) {
                System.out.print(i + "\t");
            }
        System.out.println("\nКоличество замен: "+numberTransfers);
    }
}
