package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите количество точек на плоскосте: ");
        int n=scan.nextInt();
        double[][] array=new double[n][2];
        for (int i=0;i<n;i++){
            System.out.print("Введите координату X точки №"+(i+1)+": ");
            array[i][0]=scan.nextDouble();
            System.out.print("Введите координату Y точки №"+(i+1)+": ");
            array[i][1]=scan.nextDouble();
        }
        distance(array);
    }

    private static void distance(double[][] points){
        double distance=0;
        int point1=0;
        int point2=0;
        for (int i=0;i<points.length;i++) {
            for (int j = i+1; j < points.length; j++) {
                if (distance < Math.sqrt(Math.pow((points[j][0] - points[i][0]), 2) + Math.pow((points[j][1] - points[i][1]), 2))) {
                    distance = Math.sqrt(Math.pow((points[j][0] - points[i][0]), 2) + Math.pow((points[j][1] - points[i][1]), 2));
                    point1 = i + 1;
                    point2=j+1;
                }
            }
        }
        System.out.println("Самое большое расстояние между точками "+point1+" и "+point2+" = "+Math.round(distance*100.0)/100.0);
    }
}
