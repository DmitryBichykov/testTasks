package com.metanit.informationOutput;

import com.metanit.file.OpenSaveFile;
import com.metanit.notebook.Notebook;
import com.metanit.notebook.Notes;
import com.metanit.searchAndSort.SearchAndSort;
import com.metanit.validation.Validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class InformationOutput {

    public void mainMenu(Notebook notebook){
        Scanner scan=new Scanner(System.in);
        System.out.println("Выберите необходимое действие:");
        int op=0;
        while (op!=6){
                System.out.println("1. Просмотреть все заметки;\n2. Добавить новую заметку;\n3. Удалить заметку;\n" +
                        "4. Произвести поиск;\n5. Произвести сортировку записей;\n6. Закончить работу с программой.");
            String operation = scan.next();
            try{
            op = Integer.parseInt(operation);
            switch (op) {
                case 1:
                    displayNotes(notebook);
                    break;
                case 2:
                    addNote(notebook);
                    break;
                case 3:
                    deleteNote(notebook);
                    break;
                case 4:
                   noteSearch(notebook);
                    break;
                case 5:
                    noteSort(notebook);
                    break;
                case 6:
                    new OpenSaveFile().saveToFile(notebook);
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
            }catch (NumberFormatException | ParseException e){
                System.out.println("Ошибка ввода!");
            }
        }
    }

    private void displayNotes(Notebook notebook){
        int number=1;
        for (Notes i:notebook.getNotes()){
            System.out.printf("%d. %s\n",number++,i.toString());
        }
    }

    private void addNote(Notebook notebook) throws ParseException {
        Scanner scan=new Scanner(System.in);
        Validation validation=new Validation();
        System.out.print("Введите тему: ");
        String topic=scan.nextLine();
        System.out.print("Введите дату: ");
        String dt=scan.next();
        while (!validation.dateValidation(dt)){
            System.out.println("Ошибка ввода! Формат даты должен быть дд.мм.гггг!");
            dt=scan.next();
        }
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        Date date = format.parse(dt);
        System.out.print("Введите e-mail адресс: ");
        String mail=scan.next();
        while (!validation.mailValidation(mail)){
            System.out.println("Ошибка ввода! Неверно введен e-mail адресс!");
            mail=scan.next();
        }
        scan.nextLine();
        System.out.print("Введите сообщение: ");
        String message=scan.nextLine();
        System.out.println(message);
        notebook.setNotes(new Notes(topic,date,mail,message));
    }

    private void deleteNote(Notebook notebook){
        Scanner scan=new Scanner(System.in);
        displayNotes(notebook);
        System.out.print("Введите номер заметки, которую необходимо удалить: ");
        String operation=scan.next();
        int op=Integer.parseInt(operation);
        notebook.getNotes().remove(op-1);
    }

    private void noteSearch(Notebook notebook) throws ParseException {
        Scanner scan=new Scanner(System.in);
        SearchAndSort searchAndSort=new SearchAndSort();
        Validation validation=new Validation();
        int op=0;
        while (op!=6) {
            System.out.println("1. Произвести поиск по теме;\n2. Произвести поиск по дате;\n3. Произвести посик по электронному адресу;\n" +
                    "4. Произвести поиск по дате и электронному адресу;\n5. Произвести поиск по слову;\n6. Выйти в главное меню.");
            String operation=scan.next();
            op=Integer.parseInt(operation);
            scan.nextLine();
            switch (op){
                case 1:
                    System.out.print("Введите искомую тему: ");
                    String topic=scan.nextLine();
                    searchAndSort.searchByTopic(notebook,topic);
                    break;
                case 2:
                    System.out.print("Введите искомую дату: ");
                    String dt=scan.next();
                    while (!validation.dateValidation(dt)){
                        System.out.println("Ошибка ввода! Формат даты должен быть дд.мм.гггг!");
                        dt=scan.next();
                    }
                    DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                    Date date = format.parse(dt);
                    searchAndSort.searchByDate(notebook,date);
                    break;
                case 3:
                    System.out.print("Введите искомый электронный адрес:");
                    String mail=scan.next();
                    while (!validation.mailValidation(mail)){
                        System.out.println("Ошибка ввода! Неверно введен e-mail адресс!");
                        mail=scan.next();
                    }
                    searchAndSort.searchByMail(notebook,mail);
                    break;
                case 4:
                    System.out.print("Введите искомую дату:");
                    dt=scan.next();
                    while (!validation.dateValidation(dt)){
                        System.out.println("Ошибка ввода! Формат даты должен быть дд.мм.гггг!");
                        dt=scan.next();
                    }
                    format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                    date = format.parse(dt);
                    System.out.print("Введите искомый электронный адрес:");
                    mail=scan.next();
                    while (!validation.mailValidation(mail)){
                        System.out.println("Ошибка ввода! Неверно введен e-mail адресс!");
                        mail=scan.next();
                    }
                    searchAndSort.searchByDateAndMail(notebook,date,mail);
                    break;
                case 5:
                    System.out.print("Введите искомый слово или его часть:");
                    String word=scan.next();
                    searchAndSort.searchByWord(notebook,word);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
        }
    }

    private void noteSort(Notebook notebook) {
        Scanner scan=new Scanner(System.in);
        SearchAndSort searchAndSort=new SearchAndSort();
        int op=0;
        while (op!=3) {
            System.out.println("1. Отсортировать по теме;\n2. Отсортировать по дате;\n3. Выйти в главное меню.");
            String operation=scan.next();
            op=Integer.parseInt(operation);
            switch (op){
                case 1:
                    searchAndSort.sortByTopic(notebook);
                    displayNotes(notebook);
                    break;
                case 2:
                    searchAndSort.sortByDate(notebook);
                    displayNotes(notebook);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
        }
    }
}
