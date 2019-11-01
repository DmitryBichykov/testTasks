package com.metanit.menu;

import com.metanit.authentication.Account;
import com.metanit.catalog.Catalog;
import com.metanit.mail.MailingEmail;

import java.io.IOException;
import java.util.Scanner;

public class MenuEntryForUser extends MenuEntry {

    public void mainMenuOutput(Catalog catalog, Account[] accounts,int indexUser) throws IOException {
        Scanner scan=new Scanner(System.in);
        int op=0;
        while (op!=4) {
            System.out.println("1. Просмотреть каталог книг;\n2. Произвести поиск книги;\n3. Предложить книгу администратору;\n4. Закончить работу с программой.");
            String operation = scan.next();
            try {
                op = Integer.parseInt(operation);
                switch (op) {
                    case 1:
                        displayCatalog(catalog);
                        break;
                    case 2:
                        menuSearchBook(catalog);
                        break;
                    case 3:
                        offerBook(accounts,indexUser);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Невырный ввод!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }

    private void offerBook(Account[] accounts,int indexUser){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите название и атора книги: ");
        String book=scan.nextLine();
        new MailingEmail().mailingBook(book,accounts,indexUser);
    }
}
