package com.metanit.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputCheck {

    public boolean loginVerification(String login){
        Pattern pattern=Pattern.compile("^[A-Za-zА-Яа-я0-9_.-]+$");
        Matcher matcher=pattern.matcher(login);
        return matcher.find();
    }

    public boolean passwordVerification(String password){
        Pattern pattern=Pattern.compile("^[A-Za-z0-9]{4,}$");
        Matcher matcher=pattern.matcher(password);
        return matcher.find();
    }

    public boolean roleVerification(String role){
        boolean bool=false;
        if (role.toLowerCase().equals("administrator") || role.toLowerCase().equals("user")) bool=true;
        return bool;
    }

    public boolean mailVerification(String mail){
        Pattern pattern=Pattern.compile("^[A-Za-z0-9._-]+[@]([A-Za-z]+)[.]([A-Za-z]+)$");
        Matcher matcher=pattern.matcher(mail);
        return matcher.find();
    }
}
