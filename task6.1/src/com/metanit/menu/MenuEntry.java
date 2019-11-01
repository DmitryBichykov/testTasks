package com.metanit.menu;

import com.metanit.main.InputCheck;
import com.metanit.authentication.Account;
import com.metanit.authentication.Authentication;
import com.metanit.catalog.Books;
import com.metanit.catalog.Catalog;
import com.metanit.mail.MailingEmail;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MenuEntry {

    public void mainMenuOutput(Catalog catalog,Account[] accounts,int indexUser) throws IOException {
        Scanner scan=new Scanner(System.in);
        int op=0;
        while (op!=5) {
            System.out.println("1. Просмотреть каталог книг;\n2. Модифицировать каталог книг;\n3. Произвести поиск книги;\n4. Модификация учетных данных;\n5. Закончить работу с программой.");
            String operation = scan.next();
            try {
                op = Integer.parseInt(operation);
                switch (op) {
                    case 1:
                        displayCatalog(catalog);
                        break;
                    case 2:
                        menuCatalogModification(accounts,catalog,indexUser);
                        break;
                    case 3:
                        menuSearchBook(catalog);
                        break;
                    case 4:
                        accounts=menuCredentialModification(accounts);
                        break;
                    case 5:
                        catalog.saveCatalogInFile();
                        new Authentication().saveAccounts(accounts);
                        break;
                    default:
                        System.out.println("Невырный ввод!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }

    protected void menuSearchBook(Catalog catalog){
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Произвести поиск книги по наименование;\n2. Произвести поиск книг по автору.");
        String select=scan.next();
        int op1=Integer.parseInt(select);
        switch (op1){
            case 1:
                System.out.print("Введите название искомой книги: ");
                scan.nextLine();
                String nameSearchBook=scan.nextLine();
                Books[] searchBook=catalog.searchBookByName(nameSearchBook);
                System.out.println("Найденый результат:");
                for (Books i:searchBook){
                    System.out.println(i.getName()+" || "+i.getAuthor()+" || "+i.getDescription());
                }
                break;
            case 2:
                System.out.print("Введите ФИО автора: ");
                scan.nextLine();
                String nameAuthorSearchBook=scan.nextLine();
                Books[] searchBook2=catalog.searchBookByAuthor(nameAuthorSearchBook);
                System.out.println("Найденый результат:");
                for (Books i:searchBook2){
                    System.out.println(i.getName()+" || "+i.getAuthor()+" || "+i.getDescription());
                }
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }

    private void menuCatalogModification(Account[] account,Catalog catalog,int indexUser) {
        Scanner scan=new Scanner(System.in);
        Books book;
        int op2=0;
        while (op2!=4) {
            System.out.println("1. Добавить книгу;\n2. Редактировать книгу;\n3. Удалить книгу;\n4. Выйти в главное меню.");
            String operation = scan.next();
            try {
                op2 = Integer.parseInt(operation);
                switch (op2) {
                    case 1:
                        System.out.print("Введите название книги: ");
                        scan.nextLine();
                        String nameBook = scan.nextLine();
                        System.out.print("Введите автора книги: ");
                        String authorBook = scan.nextLine();
                        System.out.print("Введите описание книги: ");
                        String descriptionBook = scan.nextLine();
                        book=new Books(authorBook, nameBook, descriptionBook);
                        catalog.addBook(book);
                        new MailingEmail().mailing(account,indexUser,book);
                        break;
                    case 2:
                        menuEditBook(catalog);
                        break;
                    case 3:
                        displayCatalog(catalog);
                        System.out.print("Введите номер книги: ");
                        String numberBook=scan.next();
                        int number=Integer.parseInt(numberBook);
                        catalog.deleteBook(number);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Неверный ввод!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }

    private String inputCheck(){
        Scanner scan=new Scanner(System.in);
        String select=scan.next();
        while (!select.equals("д") && !select.equals("н")){
            System.out.println("Неверный ввод!");
            select=scan.next();
        }
        return select;
    }

    private void menuEditBook(Catalog catalog){
        Scanner scan=new Scanner(System.in);
        String nameBook;
        String authorBook;
        String descriptionBook;
        displayCatalog(catalog);
        System.out.print("Введите номер книги: ");
        String numberBook=scan.next();
        int number = Integer.parseInt(numberBook);
        System.out.print("Изменить название книги (введите д/н): ");
        String select=inputCheck();
        if (select.equals("д")) {
            System.out.print("Введите новое название книги: ");
            scan.nextLine();
            nameBook = scan.nextLine();
        }else nameBook=catalog.getBook()[number-1].getName();
        System.out.print("Изменить автора книги (введите д/н): ");
        select=inputCheck();
        if (select.equals("д")) {
            System.out.print("Введите нового автора книги: ");
            authorBook = scan.nextLine();
        }else authorBook=catalog.getBook()[number-1].getAuthor();
        System.out.print("Изменить описание книги (введите д/н): ");
        select=inputCheck();
        if (select.equals("д")) {
            System.out.print("Введите новое описание книги: ");
            scan.nextLine();
            descriptionBook = scan.nextLine();
        }else descriptionBook=catalog.getBook()[number-1].getDescription();
        catalog.bookEditing(number, authorBook, nameBook, descriptionBook);
    }

    protected void displayCatalog(Catalog catalog) {
        int j = 1;
        for (Books i : catalog.getBook()) {
            System.out.printf("%d. %S || %s || %s\n", j++, i.getAuthor(), i.getName(), i.getDescription());
        }
    }

    private Account[] menuCredentialModification(Account[] accounts) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Добавление пользователя;\n2. Модификация пользователя;\n3. Удаление пользователя;\n4. Выйти в главное меню.");
        String operation=scan.next();
        int op = Integer.parseInt(operation);
        InputCheck inputCheck = new InputCheck();
        switch (op) {
            case 1:
                System.out.print("Введите имя пользователя: ");
                String login = scan.next();
                while (!inputCheck.loginVerification(login)) {
                    System.out.println("Ошибка ввода. Имя пользователя может состоять только из латинский букв и кирилицы, а также содержать знаки _,.,-.");
                    login = scan.next();
                }
                boolean bool=false;
                while (!bool){
                    for (Account i:accounts){
                        if (i.getName().toLowerCase().equals(login.toLowerCase())){
                            System.out.println("Пользователь с таким именем уже существует!");
                            bool=false;
                            login = scan.next();
                            break;
                        }else bool=true;
                    }
                }
                System.out.print("Введите пароль:");
                String pass = scan.next();
                while (!inputCheck.passwordVerification(pass)) {
                    System.out.println("Ошибка ввода. Пароль может состоять только из латинских букв верхнего и нижнего регистра и цифр. " +
                            "Пароль должен быть не менее 4-ех знаков.");
                    pass = scan.next();
                }
                System.out.print("Введите роль пользователя в формате (administrator/user):");
                String role = scan.next();
                while (!inputCheck.roleVerification(role)) {
                    System.out.println("Ошибка ввода. Введите роль в формате (administrator/user).");
                    role = scan.next();
                }
                System.out.print("Введите email пользователя:");
                String mail = scan.next();
                while (!inputCheck.mailVerification(mail)) {
                    System.out.println("Ошибка ввода.");
                    mail = scan.next();
                }
                bool=false;
                while (!bool){
                    for (Account i:accounts){
                        if (i.getMail().toLowerCase().equals(mail.toLowerCase())){
                            System.out.println("Даный email адрес уже зарегестрирован в системе!");
                            bool=false;
                            mail = scan.next();
                            break;
                        }else bool=true;
                    }
                }
                accounts = Arrays.copyOf(accounts, accounts.length + 1);
                accounts[accounts.length - 1] = new Account(login, pass, role, mail);
                break;
            case 2:
                int j = 1;
                for (Account i : accounts) {
                    System.out.println((j++) + ". " + i.getName() + " | " + i.getPassword() + " | " + i.getRoles() + " | " + i.getMail());
                }

                System.out.print("Введите номер пользователя, для возврата в главное меню введите 0: ");
                String number = scan.next();
                int num = Integer.parseInt(number);
                if (num == 0) break;
                while (num > accounts.length) {
                    System.out.println("Ошибка ввода!");
                    number = scan.next();
                    num = Integer.parseInt(number);
                }
                System.out.print("Изменить имя пользовтаеля (введите д/н): ");
                String select = inputCheck();
                String newLogin;
                if (select.equals("д")) {
                    System.out.print("Введите новое имя пользователя: ");
                    newLogin = scan.next();
                    while (!inputCheck.loginVerification(newLogin)) {
                        System.out.println("Ошибка ввода. Имя пользователя может сосоять только из латинский букв и кирилицы, а также содержать знаки _,.,-.");
                        newLogin = scan.next();
                    }
                    bool=false;
                    while (!bool){
                        for (Account i:accounts){
                            if (i.getName().toLowerCase().equals(newLogin.toLowerCase())){
                                System.out.println("Пользователь с таким именем уже существует!");
                                bool=false;
                                newLogin = scan.next();
                                break;
                            }else bool=true;
                        }
                    }
                    accounts[num - 1].setName(newLogin);
                }

                System.out.print("Изменить пароль (введите д/н): ");
                select = inputCheck();
                String newPassword;
                if (select.equals("д")) {
                    System.out.print("Введите новый пароль: ");
                    newPassword = scan.next();
                    while (!inputCheck.passwordVerification(newPassword)) {
                        System.out.println("Ошибка ввода. Пароль может состоять только из латинских букв верхнего и нижнего регистра и цифр. " +
                                "Пароль должен быть не менее 4-ех знаков.");
                        newPassword = scan.next();
                    }
                    accounts[num - 1].setPassword(newPassword);
                }

                System.out.print("Изменить роль (введите д/н): ");
                select = inputCheck();
                String newRole;
                if (select.equals("д")) {
                    System.out.print("Введите новую роль (administrator/user): ");
                    newRole = scan.next();
                    while (!inputCheck.roleVerification(newRole)) {
                        System.out.println("Ошибка ввода. Введите роль в формате (administrator/user).");
                        newRole = scan.next();
                    }
                    accounts[num - 1].setRoles(newRole);
                }

                System.out.print("Изменить email (введите д/н): ");
                select = inputCheck();
                String newMail;
                if (select.equals("д")) {
                    System.out.print("Введите новый email: ");
                    newMail = scan.next();
                    while (!inputCheck.mailVerification(newMail)) {
                        System.out.println("Ошибка ввода.");
                        newMail = scan.next();
                    }
                    bool=false;
                    while (!bool){
                        for (Account i:accounts){
                            if (i.getMail().toLowerCase().equals(newMail.toLowerCase())){
                                System.out.println("Данный email адрес уже зарегестирован в системе!");
                                bool=false;
                                newMail = scan.next();
                                break;
                            }else bool=true;
                        }
                    }
                    accounts[num - 1].setMail(newMail);
                }
                break;
            case 3:
                j = 1;
                for (Account i : accounts) {
                    System.out.println((j++) + ". " + i.getName() + " | " + i.getPassword() + " | " + i.getRoles() + " | " + i.getMail());
                }

                System.out.print("Введите номер пользователя, для возврата в главное меню введите 0: ");
                number = scan.next();
                num = Integer.parseInt(number);
                if (num == 0) break;
                while (num > accounts.length) {
                    System.out.println("Ошибка ввода!");
                    number = scan.next();
                    num = Integer.parseInt(number);
                }
                System.out.print("Удалить пользователя "+accounts[num-1].getName()+" (введите д/н)?  ");
                select = inputCheck();
                if (select.equals("д")) {
                    for (int i=num;i<accounts.length;i++)
                    {
                        accounts[num-1]=accounts[num];
                    }
                    accounts=Arrays.copyOf(accounts,accounts.length-1);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Ошибка ввода!");
        }
        return accounts;
    }
}
