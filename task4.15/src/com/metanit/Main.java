package com.metanit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Transport transport1 = new Transport("автобус");
        Transport transport2 = new Transport("авиатранспорт");
        Transport transport3 = new Transport("круизный лайнер");
        Transport transport4 = new Transport("пассажирский поезд");

        Food food1 = new Food("все включено");
        Food food2 = new Food("завтрак");
        Food food3 = new Food("завтрак, обед, ужин");
        Food food4 = new Food("завтрак, обед");
        Food food5 = new Food("без питания");

        Destination destination1 = new Destination("Прага");
        Destination destination2 = new Destination("Карловы-вары");
        Destination destination3 = new Destination("Болгария");
        Destination destination4 = new Destination("Греция");
        Destination destination5 = new Destination("Лондон");
        Destination destination6 = new Destination("Варшава");

        TravelTime travelTime1 = new TravelTime("7 дней");
        TravelTime travelTime2 = new TravelTime("тур выходного дня");
        TravelTime travelTime3 = new TravelTime("21 день");
        TravelTime travelTime4 = new TravelTime("14 дней");
        TravelTime travelTime5 = new TravelTime("4 дня");
        TravelTime travelTime6 = new TravelTime("30 дней");
        TravelTime travelTime7 = new TravelTime("1 день");

        TypeOfRest typeOfRest1 = new TypeOfRest("экскурсии");
        TypeOfRest typeOfRest2 = new TypeOfRest("отдых");
        TypeOfRest typeOfRest3 = new TypeOfRest("лечение");
        TypeOfRest typeOfRest4 = new TypeOfRest("шопинг");
        TypeOfRest typeOfRest5 = new TypeOfRest("круиз");

        TravelPackages[] travelPackages = new TravelPackages[10];
        travelPackages[0] = new TravelPackages(destination1, typeOfRest1, transport1, food3, travelTime1);
        travelPackages[1] = new TravelPackages(destination2, typeOfRest3, transport2, food1, travelTime3);
        travelPackages[2] = new TravelPackages(destination3, typeOfRest2, transport1, food2, travelTime4);
        travelPackages[3] = new TravelPackages(destination4, typeOfRest5, transport3, food1, travelTime6);
        travelPackages[4] = new TravelPackages(destination5, typeOfRest2, transport2, food4, travelTime5);
        travelPackages[5] = new TravelPackages(destination6, typeOfRest4, transport4, food5, travelTime7);
        travelPackages[6] = new TravelPackages(destination4, typeOfRest2, transport2, food2, travelTime4);
        travelPackages[7] = new TravelPackages(destination1, typeOfRest4, transport4, food5, travelTime2);
        travelPackages[8] = new TravelPackages(destination5, typeOfRest5, transport3, food3, travelTime3);
        travelPackages[9] = new TravelPackages(destination6, typeOfRest1, transport1, food2, travelTime5);
        Scanner scan = new Scanner(System.in);
        int operation = 0;
        while (operation != 4) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Отобразить все предложения;\n2. Произвести подбор путевки;\n3. Отсортировать путевки по типу;\n4. Законсить работу с программой.");
            operation = scan.nextInt();
            if (operation == 1) {
                for (TravelPackages i : travelPackages) {
                    System.out.println(i.toString());
                }
            }
            if (operation == 2) {
                System.out.println("Выберите тип путевки:");
                System.out.printf("1. %s;\n2. %s;\n3. %s;\n4. %s;\n5. %s.\n", typeOfRest1.getTypeOfRest(), typeOfRest2.getTypeOfRest(), typeOfRest3.getTypeOfRest(),
                        typeOfRest4.getTypeOfRest(), typeOfRest5.getTypeOfRest());
                int numberTypeOfRest = scan.nextInt();
                System.out.println("1. Показать результат для выбранного типа отдыха;\n2. Перейти к выбору транспорта.");
                int selection = scan.nextInt();
                if (selection == 1) {
                    switch (numberTypeOfRest) {
                        case 1:
                            for (TravelPackages i : travelPackages) {
                                if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest1.getTypeOfRest()))
                                    System.out.println(i.toString());
                            }
                            break;
                        case 2:
                            for (TravelPackages i : travelPackages) {
                                if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest2.getTypeOfRest()))
                                    System.out.println(i.toString());
                            }
                            break;
                        case 3:
                            for (TravelPackages i : travelPackages) {
                                if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest3.getTypeOfRest()))
                                    System.out.println(i.toString());
                            }
                            break;
                        case 4:
                            for (TravelPackages i : travelPackages) {
                                if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest4.getTypeOfRest()))
                                    System.out.println(i.toString());
                            }
                            break;
                        case 5:
                            for (TravelPackages i : travelPackages) {
                                if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest5.getTypeOfRest()))
                                    System.out.println(i.toString());
                            }
                            break;
                        default:
                            System.out.println("Вы ввели не верное значение!");
                            break;
                    }
                }
                if (selection == 2) {
                    System.out.println("Выберите тип транспорта:");
                    String[] array = new String[0];
                    switch (numberTypeOfRest) {
                        case 1:
                            array = showSelectionTransport(travelPackages, typeOfRest1);
                            break;
                        case 2:
                            array = showSelectionTransport(travelPackages, typeOfRest2);
                            break;
                        case 3:
                            array = showSelectionTransport(travelPackages, typeOfRest3);
                            break;
                        case 4:
                            array = showSelectionTransport(travelPackages, typeOfRest4);
                            break;
                        case 5:
                            array = showSelectionTransport(travelPackages, typeOfRest5);
                            break;
                        default:
                            System.out.println("Вы ввели не верное значение!");
                            break;
                    }
                    int numberTransport = scan.nextInt();
                    System.out.println("1. Показать результат для выбранного типа отдыха и транспорта;\n2. Перейти к выбору типа питания.");
                    selection = scan.nextInt();
                    if (selection == 1) {
                        {
                            switch (numberTypeOfRest) {
                                case 1:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest1.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 2:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest2.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 3:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest3.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 4:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest4.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 5:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest5.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                default:
                                    System.out.println("Вы ввели не верное значение!");
                                    break;
                            }
                        }
                    }
                    if (selection == 2) {
                        System.out.println("Выберите тип питания:");
                        String[] array2 = new String[0];
                        switch (numberTypeOfRest) {
                            case 1:
                                array2 = showSelectionFood(travelPackages, typeOfRest1, array[numberTransport - 1]);
                                break;
                            case 2:
                                array2 = showSelectionFood(travelPackages, typeOfRest2, array[numberTransport - 1]);
                                break;
                            case 3:
                                array2 = showSelectionFood(travelPackages, typeOfRest3, array[numberTransport - 1]);
                                break;
                            case 4:
                                array2 = showSelectionFood(travelPackages, typeOfRest4, array[numberTransport - 1]);
                                break;
                            case 5:
                                array2 = showSelectionFood(travelPackages, typeOfRest5, array[numberTransport - 1]);
                                break;
                            default:
                                System.out.println("Вы ввели не верное значение!");
                                break;
                        }
                        int numberFood = scan.nextInt();
                        System.out.println("1. Показать результат для выбранного типа отдыха, транспорта и типа питания;\n2. Перейти к выбору числа дней.");
                        selection = scan.nextInt();
                        if (selection == 1) {
                            {
                                switch (numberTypeOfRest) {
                                    case 1:
                                        for (TravelPackages i : travelPackages) {
                                            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest1.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]))
                                                System.out.println(i.toString());
                                        }
                                        break;
                                    case 2:
                                        for (TravelPackages i : travelPackages) {
                                            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest2.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]))
                                                System.out.println(i.toString());
                                        }
                                        break;
                                    case 3:
                                        for (TravelPackages i : travelPackages) {
                                            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest3.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]))
                                                System.out.println(i.toString());
                                        }
                                        break;
                                    case 4:
                                        for (TravelPackages i : travelPackages) {
                                            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest4.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]))
                                                System.out.println(i.toString());
                                        }
                                        break;
                                    case 5:
                                        for (TravelPackages i : travelPackages) {
                                            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest5.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]))
                                                System.out.println(i.toString());
                                        }
                                        break;
                                    default:
                                        System.out.println("Вы ввели не верное значение!");
                                        break;
                                }
                            }
                        }
                        if (selection == 2) {
                            System.out.println("Выберите количество дней:");
                            String[] array3 = new String[0];
                            switch (numberTypeOfRest) {
                                case 1:
                                    array3 = showSelectionTravelTime(travelPackages, typeOfRest1, array[numberTransport - 1],array2[numberFood-1]);
                                    break;
                                case 2:
                                    array3 = showSelectionTravelTime(travelPackages, typeOfRest2, array[numberTransport - 1],array2[numberFood-1]);
                                    break;
                                case 3:
                                    array3 = showSelectionTravelTime(travelPackages, typeOfRest3, array[numberTransport - 1],array2[numberFood-1]);
                                    break;
                                case 4:
                                    array3 = showSelectionTravelTime(travelPackages, typeOfRest4, array[numberTransport - 1],array2[numberFood-1]);
                                    break;
                                case 5:
                                    array3 = showSelectionTravelTime(travelPackages, typeOfRest5, array[numberTransport - 1],array2[numberFood-1]);
                                    break;
                                default:
                                    System.out.println("Вы ввели не верное значение!");
                                    break;
                            }
                            int numberTravelTime = scan.nextInt();
                            switch (numberTypeOfRest) {
                                case 1:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest1.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]) && i.getTravelTime().getTravelTime().equals(array3[numberTravelTime-1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 2:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest2.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]) && i.getTravelTime().getTravelTime().equals(array3[numberTravelTime-1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 3:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest3.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]) && i.getTravelTime().getTravelTime().equals(array3[numberTravelTime-1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 4:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest4.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]) && i.getTravelTime().getTravelTime().equals(array3[numberTravelTime-1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                case 5:
                                    for (TravelPackages i : travelPackages) {
                                        if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest5.getTypeOfRest()) && i.getTransport().getTransport().equals(array[numberTransport - 1]) && i.getFood().getFood().equals(array2[numberFood - 1]) && i.getTravelTime().getTravelTime().equals(array3[numberTravelTime-1]))
                                            System.out.println(i.toString());
                                    }
                                    break;
                                default:
                                    System.out.println("Вы ввели не верное значение!");
                                    break;
                            }
                        }

                    }
                }
            }
            if (operation==3){
                sortTravelPackagesByType(travelPackages);
                for (TravelPackages i : travelPackages) {
                    System.out.println(i.toString());
                }
            }
        }
    }

    private static String[] showSelectionTransport(TravelPackages[] travelPackages,TypeOfRest typeOfRest){
        int indexArray=0;
        String[] array=new String[0];
        for (TravelPackages i:travelPackages) {
            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest.getTypeOfRest())) {
                boolean bool = true;
                for (String j:array) {
                    if (j.equals(i.getTransport().getTransport())) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    array = Arrays.copyOf(array, indexArray + 1);
                    array[indexArray] = i.getTransport().getTransport();
                    indexArray++;
                    System.out.println(indexArray + ". " + i.getTransport().getTransport());
                }
            }
        }
        return array;
    }

    private static String[] showSelectionFood(TravelPackages[] travelPackages,TypeOfRest typeOfRest,String transport){
        String[] array=new String[0];
        int indexArray=0;
        for (TravelPackages i:travelPackages){
            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest.getTypeOfRest())&&i.getTransport().getTransport().equals(transport)){
                boolean bool = true;
                for (String j:array) {
                    if (j.equals(i.getFood().getFood())) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    array = Arrays.copyOf(array, indexArray + 1);
                    array[indexArray] = i.getFood().getFood();
                    indexArray++;
                    System.out.println(indexArray+". "+i.getFood().getFood());
                }
            }
        }
        return array;
    }

    private static String[] showSelectionTravelTime(TravelPackages[] travelPackages,TypeOfRest typeOfRest,String transport,String food){
        String[] array=new String[0];
        int indexArray=0;
        for (TravelPackages i:travelPackages){
            if (i.getTypeOfRest().getTypeOfRest().equals(typeOfRest.getTypeOfRest())&&i.getTransport().getTransport().equals(transport)&&i.getFood().getFood().equals(food)){
                boolean bool = true;
                for (String j:array) {
                    if (j.equals(i.getTravelTime().getTravelTime())) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    array = Arrays.copyOf(array, indexArray + 1);
                    array[indexArray] = i.getTravelTime().getTravelTime();
                    indexArray++;
                    System.out.println(indexArray+". "+i.getTravelTime().getTravelTime());
                }
            }
        }
        return array;
    }

    private static void sortTravelPackagesByType(TravelPackages[] travelPackages){
        int i=0;
        while (i<travelPackages.length-1){
            if (travelPackages[i].getTypeOfRest().getTypeOfRest().compareTo(travelPackages[i+1].getTypeOfRest().getTypeOfRest())<=0){
                i++;
            }else {
                TravelPackages temp=travelPackages[i];
                travelPackages[i]=travelPackages[i+1];
                travelPackages[i+1]=temp;
                if (i!=0) i--;
            }
        }
    }
}
