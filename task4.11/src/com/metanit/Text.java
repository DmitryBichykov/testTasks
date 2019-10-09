package com.metanit;


public class Text {
    private String title;
    private StringBuilder text=new StringBuilder();

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(Word word) {
        text.append(" ").append(word.getWord());
    }

    public void setText(Sentence sentence) {
        text.append(" ").append(sentence.getSentence());
    }

    public String toString(){
        return String.format("Заголовок текста: %s\nТекст: %s",title.toString(),text.toString());
    }
}
