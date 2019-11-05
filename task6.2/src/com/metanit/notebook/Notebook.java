package com.metanit.notebook;

import java.io.Serializable;
import java.util.ArrayList;

public class Notebook implements Serializable {
    private ArrayList<Notes> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void setNotes(Notes notes) {
        this.notes.add(notes);
    }

    public ArrayList<Notes> getNotes() {
        return notes;
    }
}
