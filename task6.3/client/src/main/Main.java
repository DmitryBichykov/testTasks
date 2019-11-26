package main;

import client.Client;
import mainMenu.MainMenu;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        MainMenu mainMenu = new MainMenu(client);
        mainMenu.displayMainMenu();
    }
}
