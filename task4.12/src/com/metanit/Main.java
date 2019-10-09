package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Марка автомобиля: ");
        String carModel=scan.nextLine();
	Car car=new Car(carModel);
        System.out.print("Количество колес: ");
        int numberWheel=scan.nextInt();
	Wheel wheel=new Wheel();
	wheel.setNumberOfWheels(numberWheel);
	Engine engine=new Engine();
	scan.nextLine();
        System.out.print("Заправить автомобиль (введите да/нет)?: ");
        String fuel=scan.nextLine();
        if (fuel.equals("да")){
            System.out.print("Сколько литров залить?: ");
            car.fuel(scan.nextDouble());
        }else  car.fuel(0);
        scan.nextLine();
        System.out.print("Завести автомобиль(введите да/нет)?: ");
        String startEngine=scan.nextLine();
        if (startEngine.equals("да")){
            engine.setStartEngine(true,car);
        }else engine.setStartEngine(false,car);
        System.out.print("Ну, что поехали (введите да/нет)?: ");
        String startDrive=scan.nextLine();
        System.out.println(car.toString());
        if (startDrive.equals("да")){
            car.drive(wheel,engine);
        }
        System.out.print("Пробито колесо, заменить(введите да/нет)?: ");
        String changeWheel=scan.nextLine();
        if (changeWheel.equals("да")){
            car.changeWheel(wheel,engine);
        }
    }
}
