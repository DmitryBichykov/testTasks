package com.metanit;

import java.io.*;

public class TextFile {
    private Directory directory;
    private FileName fileName;

    public TextFile(Directory directory, FileName file) {
        this.directory = directory;
        this.fileName = file;
    }

    public void setFileName(FileName file) {
        this.fileName = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public FileName getFileName() {
        return fileName;
    }

    public boolean create() throws IOException {
        return new File(directory.getDirectory()+fileName.getFileName()).createNewFile();
    }

    public boolean rename(String newName) throws IOException{
        return new File(directory.getDirectory()+fileName.getFileName()).renameTo(new File(directory.getDirectory()+newName));
    }

    public BufferedReader displayContents() throws FileNotFoundException {
        return new BufferedReader(new FileReader(directory.getDirectory()+fileName.getFileName()));
    }

    public void add(String text) throws IOException{
        try(FileWriter writer=new FileWriter(directory.getDirectory()+fileName.getFileName(),true)){
            writer.append("\n");
            writer.write(text);
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public boolean delete() throws IOException {
        return new File(directory.getDirectory()+fileName.getFileName()).delete();
    }
}
