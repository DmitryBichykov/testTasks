package com.metanit.main;

import com.metanit.file.OpenSaveFile;
import com.metanit.informationOutput.InformationOutput;
import com.metanit.notebook.Notebook;

public class Main {

    public static void main(String[] args){
        Notebook notebook=new OpenSaveFile().loadFromFile();
        InformationOutput infoOut=new InformationOutput();
        infoOut.mainMenu(notebook);
    }
}
