package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Train[] train = new Train[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите номер поезда: ");
            int numberTrain = scan.nextInt();
            System.out.print("Введите пункт назначения: ");
            String destination = scan.next();
            System.out.print("Введите время отправления: ");
            String departureTime = scan.next();
            train[i]=new Train(numberTrain,destination,departureTime);
        }
        int operation=0;
        while (operation!=4) {
            System.out.println("Выберите необходимую операцию (ввести номер операции):");
            System.out.println("1. Сортировка элементов массива по номерам поездов;" + "\n2. Вывод информации о поезде;" + "\n3. Сортировка элементов массива по пункту назначения;" + "\n4. Закончить работу с программой.");
            operation = scan.nextInt();
            if (operation == 1) {
                int i=0;
                while (i<train.length-1){
                    int number1=train[i].getNumberTrain();
                    int number2=train[i+1].getNumberTrain();
                    if (number1<=number2) i++;
                    else{
                        String tempDestination= train[i].getDestination();
                        String departureTime= train[i].getDepartureTime();
                        train[i]=new Train(number2,train[i+1].getDestination(),train[i+1].getDepartureTime());
                        train[i+1]=new Train(number1,tempDestination,departureTime);
                        if (i!=0) i--;
                    }
                }
                for (int j=0;j<5;j++){
                    System.out.println("Поезд №" + train[j].getNumberTrain() + ";\t Пункт назначения: " + train[j].getDestination() + ";\t Время отправления: " + train[j].getDepartureTime());
                }
            }else
            if (operation == 2) {
                System.out.print("Введите номер поезда, информацию о котором Вы хотите узнать: ");
                int numberTrain=scan.nextInt();
                for (int i=0;i<5;i++) {
                    train[i].displayTrainInformation(numberTrain);
                }
            }else
            if (operation == 3) {
                int i=0;
                while (i<train.length-1){
                    String destination1=train[i].getDestination();
                    String destination2=train[i+1].getDestination();
                    if (destination1.compareTo(destination2)<0) i++;
                    if (destination1.compareTo(destination2)>0){
                        int tempNumberTrain= train[i].getNumberTrain();
                        String departureTime= train[i].getDepartureTime();
                        train[i]=new Train(train[i+1].getNumberTrain(),destination2,train[i+1].getDepartureTime());
                        train[i+1]=new Train(tempNumberTrain,destination1,departureTime);
                        if (i!=0) i--;
                    }
                    if (destination1.compareTo(destination2)==0){
                        if (train[i].getDepartureTime().compareTo(train[i+1].getDepartureTime())>0) {
                            int tempNumberTrain = train[i].getNumberTrain();
                            String departureTime = train[i].getDepartureTime();
                            train[i] = new Train(train[i + 1].getNumberTrain(), destination2, train[i + 1].getDepartureTime());
                            train[i + 1] = new Train(tempNumberTrain, destination1, departureTime);
                            i++;
                        }
                    }
                }
                for (int j=0;j<5;j++){
                    System.out.println("Поезд №" + train[j].getNumberTrain() + ";\t Пункт назначения: " + train[j].getDestination() + ";\t Время отправления: " + train[j].getDepartureTime());
                }
            }else
                if (operation>4) System.out.println("Вы ввели недопустимое значение!");
        }
    }
}

    class Train{
        private int numberTrain;
        private String destination;
        private String departureTime;

        public Train(int numberTrain,String destination,String departureTime){
            this.numberTrain=numberTrain;
            this.destination=destination;
            this.departureTime=departureTime;
        }

        public void setNumberTrain(int numberTrain){
            this.numberTrain=numberTrain;
        }

        public int getNumberTrain(){
            return numberTrain;
        }

        public String getDestination() {
            return destination;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public void displayTrainInformation(int searchNumber) {
                if (numberTrain == searchNumber) {
                    System.out.println("\nПоезд №" + numberTrain + ";\t Пункт назначения: " + destination + ";\t Время отправления: " + departureTime+"\n");
                }
        }

        public void sortingByDestination(){

        }
    }

