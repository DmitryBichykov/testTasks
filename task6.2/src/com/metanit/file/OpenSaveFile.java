package com.metanit.file;

import com.metanit.notebook.Notebook;

import java.io.*;

public class OpenSaveFile {
    public Notebook loadFromFile() {
        Notebook notebook=null;
        try{
            FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\metanit\\notebook\\notebook.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            notebook= (Notebook) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return notebook;
    }

    public void saveToFile(Notebook notebook){
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\metanit\\notebook\\notebook.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(notebook);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
