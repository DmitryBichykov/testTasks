package com.metanit.main;

import com.metanit.authentication.Account;
import com.metanit.authentication.Authentication;
import com.metanit.catalog.Catalog;
import com.metanit.menu.MenuEntry;
import com.metanit.menu.MenuEntryForUser;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, IOException, ClassNotFoundException {
        Authentication authentication=new Authentication();
        Account[] accounts=authentication.userLoading();

        Scanner scan=new Scanner(System.in);
        System.out.print("Login: ");
        String login=scan.next();
        System.out.print("Password: ");
        String pass=scan.next();

        if (!authentication.userVerification(login,pass,accounts)){
            System.out.println("Неверно введен логин или пароль!");
        }else{
            authentication.saveAuthentication(login);
            Catalog catalog=new Catalog();
            catalog.openBaseCatalog();
            String role="";
            int indexUser=0;
            for (int i=0;i<accounts.length;i++){
                if (accounts[i].getName().toLowerCase().equals(login.toLowerCase())){
                    role=accounts[i].getRoles();
                    indexUser=i;
                    break;
                }
            }
            if (role.toLowerCase().equals("administrator")) {
                MenuEntry menuEntry = new MenuEntry();
                menuEntry.mainMenuOutput(catalog, accounts,indexUser);
            }else {
                MenuEntryForUser menuEntryForUser=new MenuEntryForUser();
                menuEntryForUser.mainMenuOutput(catalog, accounts,indexUser);
            }
        }
    }
}
