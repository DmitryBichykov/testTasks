package com.metanit.main;

import com.metanit.port.Berth;
import com.metanit.port.Port;
import com.metanit.ship.Ship;
import com.metanit.shipLoading.ShipLoading;
import com.metanit.shipUnloading.ShipUnloading;

public class Main {

    public static void main(String[] args) {
        Ship ship1=new Ship(1,10.0,0);
        Ship ship2=new Ship(2,5.840,5.810);
        Ship ship3=new Ship(3,25.460,23.460);
        Ship ship4=new Ship(4,7.980,0);
        Ship ship5=new Ship(5,12.400,0);
        Port port = new Port();
        port.addBerth(new Berth(1,true));
        port.addBerth(new Berth(2,true));
        port.addBerth(new Berth(3,true));
            ShipLoading shipLoading1 = new ShipLoading(ship1, port);
            shipLoading1.start();
            ShipLoading shipLoading2 = new ShipLoading(ship4, port);
            shipLoading2.start();
            ShipLoading shipLoading3 = new ShipLoading(ship5, port);
            shipLoading3.start();
            ShipUnloading shipUnloading1 = new ShipUnloading(ship2,port);
            shipUnloading1.start();
            ShipUnloading shipUnloading2 = new ShipUnloading(ship3,port);
            shipUnloading2.start();

    }
}




