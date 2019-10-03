package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.print("Введите координаты точки А треугольника: ");
        double aX=scan.nextDouble();
        double aY=scan.nextDouble();
        System.out.print("Введите координаты точки B треугольника: ");
        double bX=scan.nextDouble();
        double bY=scan.nextDouble();
        System.out.print("Введите координаты точки C треугольника: ");
        double cX=scan.nextDouble();
        double cY=scan.nextDouble();
        Triangle triangle=new Triangle(aX,aY,bX,bY,cX,cY);
        System.out.println("Площадь треугольника = "+Math.round(triangle.areaTriangle()*100.0)/100.0);
        System.out.println("Периметр треугольника = "+Math.round(triangle.trianglePerimeter()*100.0)/100.0);
        double[] area=triangle.medianIntersectionPoints();
        System.out.println("Точки пересечения медиан треугольника: ("+Math.round(area[0]*100.0)/100.0+"; "+Math.round(area[1]*100.0)/100.0+")");
    }
}

class Triangle{
    private double aX;
    private double aY;
    private double bX;
    private double bY;
    private double cX;
    private double cY;

    public Triangle(double aX,double aY,double bX,double bY,double cX,double cY){
        this.aX=aX;
        this.aY=aY;
        this.bX=bX;
        this.bY=bY;
        this.cX=cX;
        this.cY=cY;
    }

    public double areaTriangle(){
        double p=(Math.sqrt(Math.pow(aX-bX,2)+Math.pow(aY-bY,2))+Math.sqrt(Math.pow(bX-cX,2)+Math.pow(bY-cY,2))+Math.sqrt(Math.pow(cX-aX,2)+Math.pow(cY-aY,2)))/2;
        double area=Math.sqrt(p*(p-Math.sqrt(Math.pow(aX-bX,2)+Math.pow(aY-bY,2)))*(p-Math.sqrt(Math.pow(bX-cX,2)+Math.pow(bY-cY,2)))*(p-Math.sqrt(Math.pow(cX-aX,2)+Math.pow(cY-aY,2))));
        return area;
    }

    public double trianglePerimeter(){
        double perimeter=Math.sqrt(Math.pow(aX-bX,2)+Math.pow(aY-bY,2))+Math.sqrt(Math.pow(bX-cX,2)+Math.pow(bY-cY,2))+Math.sqrt(Math.pow(cX-aX,2)+Math.pow(cY-aY,2));
        return perimeter;
    }

    public double[] medianIntersectionPoints(){
        double medianIntersectionPointsX=(aX+bX+cX)/3;
        double medianIntersectionPointsY=(aY+bY+cY)/3;
        return new double[] {medianIntersectionPointsX,medianIntersectionPointsY};
    }
}
