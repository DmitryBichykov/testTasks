package com.metanit;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("I have always believed that a man must be honest. «Never ask for money you have not earned»! I always said.\n" +
                "Now I shall tell you a story which will show you how honest I have always been all my life!\n" +
                "A few days ago at my friend’s house I met General Miles. General Miles was a nice man and we became great friends very quickly.\n");
        System.out.println("Исходный текст:\n" + text);
        System.out.println("1. Сортировка абзацев по количеству строк:");
        Pattern pattern = Pattern.compile("^.+$", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(text);
        String[] str = new String[3];
        int i = 0;
        while (matcher.find()) {
            str[i] = matcher.group();
            i++;
        }
        sortingNumberOffers(str);
        Pattern pattern1 = Pattern.compile(".+?[.!?]");
        Matcher matcher1 = pattern1.matcher(text);
        System.out.println("2. Сортировка слов в предложениях:");
        while (matcher1.find()) wordSorting(matcher1.group());
        System.out.println("3. Сортировка лексем в предложении по убыванию количества вхождений заданного символа:");
        System.out.print("Введите символ:");
        Scanner scan = new Scanner(System.in);
        char symbol = scan.nextLine().charAt(0);
        Pattern pattern2 = Pattern.compile(".+?[.!?]");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) tokenSorting(symbol,matcher2.group());
    }

    private static void tokenSorting(char ch,String line){
        Pattern pattern=Pattern.compile("\\b\\w+\\b");
        String[] words=new String[0];
        Matcher matcher = pattern.matcher(line);
        int j=0;
        while (matcher.find()){
            words= Arrays.copyOf(words,words.length+1);
            words[j]=matcher.group();
            j++;
        }
        int i=words.length-1;
        while (i>0){
            int num=0;
            int num2=0;
            for (int q=0;q<words[i].length();q++) {
                if (words[i].charAt(q) == ch) {
                    num++;
                }
            }
            for (int q=0;q<words[i-1].length();q++){
                if (words[i-1].charAt(q)==ch){
                    num2++;
                }
            }
            if (num<num2) i--;
            if (num==num2) {
                if (words[i].compareTo(words[i-1])<0){
                    String temp=words[i];
                    words[i]=words[i-1];
                    words[i-1]=temp;
                    if (i!=words.length-1) i++;
                } else i--;
            }
            if (num>num2) {
                String temp=words[i];
                words[i]=words[i-1];
                words[i-1]=temp;
                if (i!=words.length-1 )i++;
            }
        }
        for (String q:words) System.out.print(q+" ");
        System.out.println();
    }

    private static void sortingNumberOffers(String[] array){
        Pattern pattern=Pattern.compile(".+?[.!?]");
        int i=0;
        while (i!=array.length-1) {
            int num=0;
            int num2=0;
            Matcher matcher = pattern.matcher(array[i]);
            while (matcher.find()) num++;
            Matcher matcher1=pattern.matcher(array[i+1]);
            while (matcher1.find())num2++;
            if (num<=num2) i++;
            else{
                String temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                if (i!=0) i--;
            }
        }
        for (String j:array) System.out.println(j);
    }

    private static void wordSorting(String line) {
        Pattern pattern=Pattern.compile("\\b\\w+\\b");
        String[] words=new String[0];
        Matcher matcher = pattern.matcher(line);
        int j=0;
        while (matcher.find()){
                words= Arrays.copyOf(words,words.length+1);
                words[j]=matcher.group();
                j++;
        }
        int i=0;
        while (i!=words.length-1){
            if (words[i].length()<=words[i+1].length()) i++;
            else{
                String temp=words[i];
                words[i]=words[i+1];
                words[i+1]=temp;
                if (i!=0) i--;
            }
        }
        for (String q:words) System.out.print(q+" ");
        System.out.println();
    }
}

