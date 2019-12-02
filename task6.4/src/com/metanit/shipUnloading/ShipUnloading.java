package com.metanit.shipUnloading;

import com.metanit.port.Port;
import com.metanit.ship.Ship;

public class ShipUnloading extends Thread{
    private Ship ship;
    private Port port;

    public ShipUnloading(Ship ship, Port port){
        this.ship=ship;
        this.port=port;
    }

    @Override
    public void run() {
        int i=0;
        int message=1;
        int message2=1;
       while (port.getCurrentAmountOfCargo()+ship.getCurrentAmountOfCargo()>port.getCapacity()) {
            if (message2==1) {
                System.out.println("В порту не хватает места для разгрузки коробля #" + ship.getNumber() + ", ожидайте.");
                message2=0;
            }
            Thread.yield();
        }
        while(!port.getBerth().get(i).isFree()){
                if (i < port.getBerth().size() - 1) i++;
                else {
                    i = 0;
                    if (message==1) {
                        System.out.println("Для корабля №" + ship.getNumber() + " нет свободного причала, ожидайте.");
                        message=0;
                    }
                }
            }

        port.getBerth().get(i).setFree(false);

        System.out.println("Производится разгрузка корабля #"+ ship.getNumber()+" на причале №"+port.getBerth().get(i).getNumber());
        try{
            int time= 5000+(int) (Math.random()*21000);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        port.setCurrentAmountOfCargo(port.getCurrentAmountOfCargo() + ship.getCurrentAmountOfCargo());
        ship.setCurrentAmountOfCargo(0);
        System.out.println("Корабль №"+ship.getNumber()+" разгружен, остаток груза в порту "+ Math.round(port.getCurrentAmountOfCargo()*100.00)/100.00+" т.");
        port.getBerth().get(i).setFree(true);
        System.out.println("Причал №"+port.getBerth().get(i).getNumber()+" свободен.");
    }
}
