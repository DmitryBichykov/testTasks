package com.metanit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	Library library=new Library();
	library.setBooks(new Book(1,"Преступлении и наказание", "Достоевский Ф.М.","Санкт-Петербург",1973,420,18,"твердый"));
	library.setBooks(new Book(2,"Капитанская дочка", "Пушкин А.С.","Санкт-Петербург",1984,120,10,"твердый"));
	library.setBooks(new Book(3,"Убить пересмешника", "Харпен Ли","Вашингтон-пресс",1970,225,15,"твердый"));
    library.setBooks(new Book(4,"Детские сказки", "Якоб и Вильгельм Гримм","Берлин",1965,589,35,"твердый"));
    library.setBooks(new Book(5,"Ревизор", "Гоголь Н.В.","Москва",1978,110,8,"мягкий"));
    library.setBooks(new Book(6,"Вино из одуванчиков", "Рэй Бредбери","Нью-йорк пресс",1993,250,8.50,"мягкий"));
    library.setBooks(new Book(7,"Анна Каренина", "Толстой Л.Н.","Русский-вестник",1877,864,23,"твердый"));
    library.setBooks(new Book(8,"Унесенные ветром", "Маргарет Митчел","Вашингтон-пресс",1936,1020,48,"твердый"));
    library.setBooks(new Book(9,"Мертвые души", "Гоголь Н.В.","Санкт-Петербург",1976,125,9.80,"мягкий"));
    library.setBooks(new Book(10,"Война и мир", "Толстой Л.Н.","Русский вестник",1869,630,35.70,"твердый"));
    int operation=0;
    while (operation!=4) {
        System.out.println("Выберите операцию:");
        System.out.println("1. Вывести список книг заданного автора;\n2. Вывести список книг, выпущенных заданным издательством;\n" +
                "3. Вывести список книг, выпущенных после заданного года;\n4. Завершить работу с программой.");
        operation=scan.nextInt();
        scan.nextLine();
        if(operation==1){
            System.out.print("Введите ФИО автора:");
            String author=scan.nextLine();
            library.findBooksByAuthor(author);
        }
        if(operation==2){
            System.out.print("Введите название издательства:");
            String publishingHouse=scan.nextLine();
            library.findBooksByPublishingHouse(publishingHouse);
        }
        if(operation==3){
            System.out.print("Введите год:");
            int year=scan.nextInt();
            library.findBooksAfterSpecifiedYear(year);
        }
        if(operation>4) System.out.println("Вы ввели не верное значение!");
    }
    }
}
