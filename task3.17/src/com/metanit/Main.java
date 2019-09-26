package com.metanit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String text="<notes> \n" +
            "   <note id = \"1\"> \n" +
            "       <to>Вася</to> \n" +
            "       <from>Света</from> \n" +
            "       <heading>Напоминание</heading> \n" +
            "       <body>Позвони мне завтра!</body> \n" +
            "   </note> \n" +
            "   <note id = \"2\"> \n" +
            "       <to>Петя</to> \n" +
            "       <from>Маша</from> \n" +
            "       <heading>Важное напоминание</heading> \n" +
            "       <body/> \n" +
            "   </note> \n" +
            "</notes> ";
        Pattern pattern=Pattern.compile("<([a-z]+)>.+</\\1>");
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()) System.out.println(matcher.group());
    }
}
