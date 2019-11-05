package com.metanit.validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public boolean dateValidation(String date) {
        try {
            return DATE_FORMAT.format(DATE_FORMAT.parse(date)).equals(date);
        }catch (ParseException ex){
            return false;
        }
    }

        public boolean mailValidation(String mail){
        Pattern pattern=Pattern.compile("^[A-Za-z0-9._-]+@[A-Za-z_-]+[.][A-Za-z]+$");
        Matcher matcher=pattern.matcher(mail);
        return matcher.find();
    }
}
