package com.metanit;

import java.util.Scanner;

public class Car {
    private String carModel;
    private double fuelLevel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    public void drive(Wheel wheel,Engine engine){
        if (wheel.getNumberOfWheels()>=4 && fuelLevel>0 && engine.isStartEngine()){
            System.out.println("Поехали!");
        }else {
            if (wheel.getNumberOfWheels() < 4) System.out.println("Не возможно ехать без колес!");
            if (fuelLevel==0) System.out.println("Бак пуст!");
            if (!engine.isStartEngine()) System.out.println("Нужно завести двигатель!");
        }
    }

    public void fuel(double fuelLevel){
        this.fuelLevel=fuelLevel;
        if (fuelLevel>0) System.out.println("Автомобиль заправлен.");
    }

    public void changeWheel(Wheel wheel,Engine engine){
        Scanner scan=new Scanner(System.in);
        if (wheel.getNumberOfWheels()<5) System.out.println("Не возможно заменить колесо, нет запаски.");
        else if(engine.isStartEngine()) System.out.print("Нельзя менять колесо при движении.");
        else{
            System.out.println("Колесо заменено.");
            wheel.setNumberOfWheels(wheel.getNumberOfWheels()-1);
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public String toString(){
        return String.format("Марка автомобиля: %S",carModel);
    }

}
