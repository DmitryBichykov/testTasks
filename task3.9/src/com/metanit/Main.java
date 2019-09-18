package com.metanit;

public class Main {

    public static void main(String[] args) {
	String word="информатика";
	char[] ch=new char[4];
	String newWord=new String();
	word.getChars(word.indexOf('т'),word.indexOf('т')+1,ch,0);
	word.getChars(word.indexOf('о'),word.indexOf('о')+1,ch,1);
	word.getChars(word.indexOf('р'),word.indexOf('р')+1,ch,2);
	word.getChars(word.indexOf('т'),word.indexOf('т')+1,ch,3);
	for (char i:ch){
	    newWord+=i;
    }
        System.out.println(newWord);
    }
}
