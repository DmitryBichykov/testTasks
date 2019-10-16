package com.metanit.logics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

    public static boolean checkingFlowersInput(String line){
        Pattern pattern=Pattern.compile("^[1-9]\\d+$");
        Matcher matcher=pattern.matcher(line);
        return matcher.find();
    }

    public static boolean checkingName(String line){
        Pattern pattern=Pattern.compile("^[A-Za-zА-Яа-я\\s]+$");
        Matcher matcher=pattern.matcher(line);
        return matcher.find();
    }
}
