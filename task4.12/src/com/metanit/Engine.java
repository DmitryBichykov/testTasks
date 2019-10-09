package com.metanit;

public class Engine {
    private boolean startEngine;

    public void setStartEngine(boolean startEngine,Car car) {
        this.startEngine = startEngine;
        if(startEngine && car.getFuelLevel()>0) System.out.println("Автомобиль заведен.");
        else if (car.getFuelLevel()==0) System.out.println("Бак пуст.");
    }

    public boolean isStartEngine() {
        return startEngine;
    }
}
