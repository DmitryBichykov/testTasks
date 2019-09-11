package com.metanit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] a={-4,2,5,10,14,23,47,59};
	int[] b={-10,1,9,34,48,54};
        System.out.println("Последовательность а:");
	for (int i:a){
        System.out.print(i+"\t");
    }
        System.out.println("\nПоследовательность b:");
        for (int i:b){
            System.out.print(i+"\t");
        }
	a=Arrays.copyOf(a,a.length+b.length);
	for (int i=0;i<b.length;i++){
	    for (int j=0;j<a.length;j++){
	        if (b[i]<a[j]){
	            for (int q=a.length-2;q>=j;q--){
	                a[q+1]=a[q];
                }
	            a[j]=b[i];
	            break;
	        }else{
	            if (b[i]>a[j] && a[j]==0){
	                a[j]=b[i];
	                break;
                }
            }
        }
    }
        System.out.println("\nНовая последовательность:");
        for (int i:a){
            System.out.print(i+"\t");
        }
    }
}
