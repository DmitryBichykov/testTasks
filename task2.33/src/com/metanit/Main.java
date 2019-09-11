package com.metanit;

public class Main {

    private static int binarySearch(int[] array,int indexSearch){
        int firstIndex=0;
        int lastIndex= array.length-1;
        int middleIndex;
        while(firstIndex<=lastIndex){
            middleIndex=(firstIndex+lastIndex)/2;
            if (array[middleIndex]<indexSearch){
                firstIndex=middleIndex+1;
            }else if (array[middleIndex]>indexSearch){
                lastIndex=middleIndex-1;
            }
        }
        middleIndex=(firstIndex+lastIndex+1)/2;
        return middleIndex;
    }

    public static void main(String[] args) {
	int[] a={-12,-3,0,2,4,10,25,43};
	int[] b={-25,-8,1,6,44,83};
        System.out.println("Последовательность А:");
	for (int i:a){
        System.out.print(i+"\t");
    }
        System.out.println("\nПоследовательность В:");
        for (int i:b){
            System.out.print(i+"\t");
        }
        System.out.println("\nМеста в последовательности А, на которые нужно вставлять элементы последовательности В, чтобы последовательность оставлась возрастающей:");
	for (int i:b){
            int index = binarySearch(a,i);
            System.out.print((index+1)+"\t");
        }
    }
}
