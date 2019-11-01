package com.metanit.catalog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Catalog {
    private Books[] book;
    private int index;

    public Catalog(){
        book=new Books[0];
        index=0;
    }

    public void addBook(Books book){
        this.book= Arrays.copyOf(this.book,this.book.length+1);
        this.book[index++] = book;
    }

    public void openBaseCatalog(){
        BufferedReader base;
        try{
            base=new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\com\\metanit\\catalog\\"+"catalog.txt"));
            String line;
            String nameBook="";
            String authorBook="";
            String descriptionBook;
            while((line=base.readLine())!=null) {
            Pattern pattern=Pattern.compile("^.+?[|]");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                authorBook = Pattern.compile("\\s[|]").matcher(matcher.group()).replaceAll("");
            }
            Pattern pattern1=Pattern.compile(".+?[|]");
            Matcher matcher1 = pattern1.matcher(line.substring(authorBook.length()+4));
            while (matcher1.find()){
                nameBook = Pattern.compile("(\\s[|])").matcher(matcher1.group()).replaceAll("");
            }
            descriptionBook=line.substring(authorBook.length()+4+nameBook.length()+4);
            addBook(new Books(authorBook,nameBook,descriptionBook));
            }
            base.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void bookEditing(int number,String author, String name,String description){
        book[number-1].setAuthor(author);
        book[number-1].setName(name);
        book[number-1].setDescription(description);
    }

    public void deleteBook(int number){
        for (int i=number; i<book.length; i++){
            book[i-1]=book[i];
        }
        book=Arrays.copyOf(book,book.length-1);
    }

    public Books[] searchBookByName(String name){
        Books[] arraySearch=new Books[0];
        int j=0;
        Pattern pattern=Pattern.compile(name.toLowerCase());
        for (Books i:book){
                Matcher matcher=pattern.matcher(i.getName().toLowerCase());
                while (matcher.find()) {
                    arraySearch = Arrays.copyOf(arraySearch, arraySearch.length + 1);
                    arraySearch[j++] = i;
                }
        }
        return arraySearch;
    }

    public Books[] searchBookByAuthor(String name){
        Books[] arraySearch=new Books[0];
        int j=0;
        Pattern pattern=Pattern.compile(name.toLowerCase());
        for (Books i:book){
            Matcher matcher=pattern.matcher(i.getAuthor().toLowerCase());
            while (matcher.find()) {
                arraySearch = Arrays.copyOf(arraySearch, arraySearch.length + 1);
                arraySearch[j++] = i;
            }
        }
        return arraySearch;
    }

    public void saveCatalogInFile() throws IOException {
        try(FileWriter writer=new FileWriter(System.getProperty("user.dir")+"\\src\\com\\metanit\\catalog\\"+"catalog.txt",false)){
            for (Books i:book) {
                writer.write(i.getAuthor() + " || " + i.getName() + " || " + i.getDescription());
                writer.append("\n");
            }
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Books[] getBook() {
        return book;
    }
}
