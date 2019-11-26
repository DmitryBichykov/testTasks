package mainMenu;

import client.Client;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainMenu {
    private Client client;
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public MainMenu(Client client) {
        this.client = client;
    }

    public void displayMainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите операцию:");

        try {
            int op = 0;
            while (op != 5) {
                System.out.println("1. Показать информацию обовсех студентах в архиве;\n2. Вывести информацию об определенном студенте;\n" +
                        "3. Добавить студента;\n4. Внести изменения;\n5. Закончить работу с программой.");
                String operation = scan.next();
                op = Integer.parseInt(operation);
                String nameStudent="";
                String dateOfBirthStudent="";
                String adresStudent="";
                switch (op) {
                    case 1:
                        client.displayAllStudents();
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.print("Введите ФИО студента или часть: ");
                        nameStudent = scan.nextLine();
                        client.displayStudent(nameStudent);
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.print("Введите ФИО студента: ");
                        nameStudent = scan.nextLine();
                        dateOfBirthStudent = "";
                        boolean bool = false;
                        while (!bool) {
                            System.out.print("Введите дату раждения студента: ");
                            dateOfBirthStudent = scan.nextLine();
                            bool = dateValidation(dateOfBirthStudent);
                            if (!bool) System.out.println("Формат ввода даты дд.мм.гггг");
                        }
                        System.out.print("Введите адрес проживания студента: ");
                        adresStudent = scan.nextLine();
                        client.addStudent(nameStudent, dateOfBirthStudent, adresStudent);
                        break;
                    case 4:
                        client.displayAllStudents();
                        bool = false;
                        String numberStudent = "";
                        while (!bool) {
                            System.out.print("Введите номер дела, которое требуется изменить:");
                            numberStudent = scan.next();
                            bool = numberValidation(numberStudent);
                            if (!bool) System.out.println("Ошибка ввода!");
                        }
                        int number = Integer.parseInt(numberStudent);
                        bool=false;
                        while(!bool){
                            System.out.print("Изменить ФИО студента (введите д/н): ");
                            String choice=scan.next();
                            if (validationYesOrNo(choice.toLowerCase())) {
                                bool=true;
                                if (choice.toLowerCase().equals("д")) {
                                    scan.nextLine();
                                    System.out.print("Введите ФИО студента: ");
                                    nameStudent=scan.nextLine();
                                }else nameStudent="0";
                            }else System.out.println("Ошибка ввода");
                        }
                        bool=false;
                        while(!bool){
                            System.out.print("Изменить дату рождения студента (введите д/н): ");
                            String choice=scan.next();
                            if (validationYesOrNo(choice))  {
                                bool=true;
                                if (choice.toLowerCase().equals("д")) {
                                    boolean boolDate=false;
                                    while (!boolDate) {
                                        System.out.print("Введите дату рождения студента: ");
                                        String date = scan.next();
                                        if (dateValidation(date)) {
                                            boolDate=true;
                                            dateOfBirthStudent = date;
                                        }else System.out.println("Формат ввода даты дд.мм.гггг");
                                    }
                                }else dateOfBirthStudent="0";
                            }else System.out.println("Ошибка ввода!");
                        }
                        bool=false;
                        while(!bool){
                            System.out.print("Изменить адрес студента (введите д/н): ");
                            String choice=scan.next();
                            if (validationYesOrNo(choice)) {
                                bool=true;
                                if (choice.toLowerCase().equals("д")) {
                                    scan.nextLine();
                                    System.out.print("Введите адрес студента: ");
                                    adresStudent=scan.nextLine();
                                }else adresStudent="0";
                            }else System.out.println("Ошибка ввода");
                        }
                        client.changeStudent(number,nameStudent,dateOfBirthStudent,adresStudent);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Ошибка ввода!");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода!");
        }
    }

    private boolean dateValidation(String date) {
        try {
            return DATE_FORMAT.format(DATE_FORMAT.parse(date)).equals(date);
        } catch (ParseException ex) {
            return false;
        }
    }

    private boolean numberValidation(String number) {
        try {
            int numberStudent = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean validationYesOrNo(String str){
        return str.equals("д") || str.equals("н");
    }
}