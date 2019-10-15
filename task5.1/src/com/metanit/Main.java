package com.metanit;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Directory directory=new Directory("D://");
        FileName fileName=new FileName("notes.txt");
	    TextFile textFile=new TextFile(directory,fileName);

        System.out.println("Создаем файл "+textFile.getFileName().getFileName()+" в каталоге "+textFile.getDirectory().getDirectory());
        try
        {
            boolean created = textFile.create();
            if(created)
                System.out.println("Файл создан!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Переименовываем файл "+textFile.getFileName().getFileName()+" в newNotes.txt");
        try
        {
            boolean rename = textFile.rename("newNotes.txt");
            if(rename)
                System.out.println("Файл переименован!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        FileName fileName2=new FileName("newNotes.txt");
        textFile.setFileName(fileName2);
        System.out.println("Выводим содержимое файла newNotes.txt на консоль:");
        BufferedReader in=textFile.displayContents();
        String line;
        while ((line=in.readLine())!=null){
            System.out.println(line);
        }
        in.close();

        System.out.println("Дополняем файл newNotes.txt:");
        textFile.add("Hello World!");

        System.out.println("Удаляем файл!");
        try{
            boolean delete=textFile.delete();
            if (delete) System.out.println("Файл "+textFile.getFileName().getFileName()+" удален!");
        }catch (IOException ex){
            ex.getMessage();
        }
    }
}
