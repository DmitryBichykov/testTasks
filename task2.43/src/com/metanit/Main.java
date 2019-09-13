package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите длину сторон четырехугольника: ");
        double X=scan.nextDouble();
        double Y=scan.nextDouble();
        double Z=scan.nextDouble();
        double T=scan.nextDouble();
        quadrangleArea(X,Y,Z,T);
    }

    private static void quadrangleArea(double A,double B, double C, double D){
        double E=Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
        double p=(C+D+E)/2;
        double h=(2*Math.sqrt(p*(p-E)*(p-C)*(p-D)))/E;
        double area=A*B/2+(E*h/2);
        System.out.println("Площадь четырехугольника равна "+Math.round(area*100.0)/100.0);
    }
}
