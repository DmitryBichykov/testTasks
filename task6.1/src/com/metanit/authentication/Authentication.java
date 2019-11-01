package com.metanit.authentication;

import com.metanit.Aes256Class;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {
    private String dateAndTime;

    public Authentication() {
        this.dateAndTime= "";
    }

    public boolean userVerification(String login,String pass,Account[] accounts){
        boolean bool=false;
        for (Account i:accounts){
            if (login.toLowerCase().equals(i.getName().toLowerCase()) && pass.equals(i.getPassword())){
                bool=true;
                break;
            }
        }
        return bool;
    }

    public void saveAuthentication(String name) {
        this.dateAndTime= new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date());
        try(FileWriter writer=new FileWriter(System.getProperty("user.dir")+"\\src\\com\\metanit\\authentication\\"+"authentication.txt",true)){
            writer.append("\n");
            writer.write(name+"\t|"+dateAndTime);
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Account[] userLoading() throws  ClassNotFoundException, IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
        Account[] accounts=new Account[0];
       try {
           FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\com\\metanit\\authentication\\" + "file");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           Aes256Class rsa = (Aes256Class) objectInputStream.readObject();
           objectInputStream.close();
           FileInputStream fileInputStream1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\com\\metanit\\authentication\\" + "file2");
           ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
           int i;
           byte[] bytes = new byte[0];
           int index = 0;
           while ((i = objectInputStream1.read()) != -1) {
               bytes = Arrays.copyOf(bytes, bytes.length + 1);
               bytes[index++] = (byte) i;
           }
           StringBuilder sb = rsa.decode(bytes);
           Pattern pattern = Pattern.compile(".+\\n");
           Matcher matcher = pattern.matcher(sb);
           int index2=0;
           while (matcher.find()) {
               Pattern pattern1 = Pattern.compile("[A-Za-zА-Яа-я0-9@._-]+");
               Matcher matcher1 = pattern1.matcher(matcher.group());
               String[] array=new String[4];
               int q=0;
               while (matcher1.find()) {
                   array[q++]=matcher1.group();
               }
               accounts=Arrays.copyOf(accounts,accounts.length+1);
               accounts[index2++]=new Account(array[0],array[1],array[2],array[3]);
           }
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
       return accounts;
    }

    public void saveAccounts(Account[] accounts){
        Aes256Class aes256=new Aes256Class();
        StringBuilder str= new StringBuilder();
        for (Account i:accounts){
            str.append(i.getName()).append(" ").append(i.getPassword()).append(" ").append(i.getRoles()).append(" ").append(i.getMail()).append("\n");
        }
        try {
            aes256.encode(str);
            FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir") + "\\src\\com\\metanit\\authentication\\" + "file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(aes256);
            objectOutputStream.close();
        }catch (IOException | NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e){
            System.out.println(e.getMessage());
        }
    }
}
