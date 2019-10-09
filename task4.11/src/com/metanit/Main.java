package com.metanit;

public class Main {

    public static void main(String[] args) {
    Text text=new Text();
    text.setTitle("Буратино");
        Word word1 = new Word("А");
        Word word2 = new Word("роза");
        Word word3 = new Word("упала");
        Sentence sentence = new Sentence("на лапу азура.");
        text.setText(word1);
        text.setText(word2);
        text.setText(word3);
        text.setText(sentence);
        System.out.println(text.toString());

    }
}
