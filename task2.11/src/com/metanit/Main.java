package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] array={{4,8,1,-3,2},{6,5,2,-8,0},{-4,3,8,2,1}};
            for (int j=0;j<array[0].length;j++) {
                if ((j + 1) % 2 != 0) {
                    if (array[0][j] > array[array.length - 1][j]) {
                        for (int i = 0; i < array.length; i++) {
                            System.out.println(array[i][j]);
                        }
                    }
                }
            }
    }
}
