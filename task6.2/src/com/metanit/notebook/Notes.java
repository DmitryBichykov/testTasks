package com.metanit.notebook;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notes implements Serializable{
    private String topic;
    private Date dateOfCreation;
    private String mail;
    private String message;

    public Notes(String topic, Date dateOfCreation, String mail, String message) {
        this.topic = topic;
        this.dateOfCreation = dateOfCreation;
        this.mail = mail;
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getMail() {
        return mail;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-15s%-20s%s",topic,new SimpleDateFormat("dd.MM.yyyy").format(dateOfCreation),mail,message);
    }
}
