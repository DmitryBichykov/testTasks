package com.metanit;

public class Main {

    private  static int binarySearch(int[] array, int numberSearch,int lastIndex){
        int firstIndex=0;
        int middleIndex;
        while (firstIndex<=lastIndex){
         middleIndex=(firstIndex+lastIndex)/2;
         if (array[middleIndex]<numberSearch){
                 firstIndex=middleIndex+1;

             }
         else if (array[middleIndex]>numberSearch){
                    lastIndex=middleIndex-1;
                }
        }
        middleIndex=(firstIndex+lastIndex+1)/2;
        return middleIndex;
    }

    public static void main(String[] args) {
        int temp;
        int[] a={-3,0,2,10,5,-4,8,12,1,-7,48,4,-24};
        System.out.println("Исходная последовательность:");
        for (int i:a){
            System.out.print(i+"\t");
        }
        for (int i=4;i<a.length;i++) {
            int index = binarySearch(a, a[i],i-1);
            temp=a[i];
            for (int j=i;j>index;j--) {
            a[j]=a[j-1];
            }
            a[index]=temp;
        }
        System.out.println("\nСортировка вставками по возрастанию:");
        for (int i:a){
            System.out.print(i+"\t");
        }
    }
}
