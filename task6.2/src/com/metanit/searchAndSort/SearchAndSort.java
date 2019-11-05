package com.metanit.searchAndSort;

import com.metanit.notebook.Notebook;
import com.metanit.notebook.Notes;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchAndSort {

    public void searchByTopic(Notebook notebook, String topic){
        for (Notes i:notebook.getNotes()){
            if (i.getTopic().toLowerCase().equals(topic.toLowerCase())){
                System.out.println(i.toString());
            }
        }
    }

    public void searchByDate(Notebook notebook,Date date){
        for (Notes i:notebook.getNotes()){
            if (i.getDateOfCreation().equals(date)){
                System.out.println(i.toString());
            }
        }
    }

    public void searchByMail(Notebook notebook,String mail){
        for (Notes i:notebook.getNotes()){
            if (i.getMail().toLowerCase().equals(mail.toLowerCase())){
                System.out.println(i.toString());
            }
        }
    }

    public void searchByDateAndMail(Notebook notebook,Date date,String mail){
        for (Notes i:notebook.getNotes()){
            if (i.getDateOfCreation().equals(date) && i.getMail().toLowerCase().equals(mail.toLowerCase())){
                System.out.println(i.toString());
            }
        }
    }

    public void searchByWord(Notebook notebook,String word){
        Pattern pattern=Pattern.compile(word.toLowerCase()+"+?");
        Matcher matcher;
        for (Notes i:notebook.getNotes()){
            matcher=pattern.matcher((i.getTopic()+i.getDateOfCreation()+i.getMail()+i.getMessage()).toLowerCase());
           if (matcher.find()){
               System.out.println(i.toString());
           }
        }
    }

    public void sortByTopic(Notebook notebook){
        notebook.getNotes().sort(Comparator.comparing(Notes::getTopic));
    }

    public void sortByDate(Notebook notebook) {
        notebook.getNotes().sort(Comparator.comparing(Notes::getDateOfCreation));
    }
}
