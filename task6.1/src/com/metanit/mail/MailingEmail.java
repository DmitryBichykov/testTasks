package com.metanit.mail;

import com.metanit.authentication.Account;
import com.metanit.catalog.Books;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailingEmail {

    public void mailing(Account[] account,int indexUser, Books book) {
    final Properties properties = new Properties();
        Scanner scan=new Scanner(System.in);
        String fromUser = account[indexUser].getMail();
        System.out.print("Введите пароль от почтового ящика "+account[indexUser].getMail()+": ");
        String pass=scan.next();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Pattern pattern=Pattern.compile("@\\w+");
        Matcher matcher=pattern.matcher(account[indexUser].getMail());
        while (matcher.find()) {
            if (matcher.group().toLowerCase().equals("@gmail")) properties.put("mail.smtp.host", "smtp.gmail.com");
            if (matcher.group().toLowerCase().equals("@mail")) properties.put("mail.smtp.host", "smtp.mail.ru");
        }
        properties.put("mail.smtp.port", "587");
        try {
            Session session = Session.getInstance(properties,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(fromUser, pass);
                        }
                    });
            for (int i=0;i<account.length;i++) {
                MimeMessage message = new MimeMessage(session); // email message
                message.setFrom(new InternetAddress(fromUser)); // setting header fields
                if (i!=indexUser) {
                    String toUser = account[i].getMail();
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toUser));
                    message.setSubject("Добавлена новай книга в каталог.");
                    message.setText(book.getAuthor() + " | " + book.getName() + " | " + book.getDescription());
                    Transport.send(message);
                }
            }
            System.out.println("Выполнена рассылка информации о добавленной книге пользователем.");
        } catch (MessagingException mex){
            System.out.println("Рассылка не произведена.");
            mex.printStackTrace(); }
    }

    public void mailingBook(String book,Account[] account,int indexUser){
        final Properties properties = new Properties();
        Scanner scan=new Scanner(System.in);
        String fromUser = account[indexUser].getMail();
        System.out.print("Введите пароль от почтового ящика "+account[indexUser].getMail()+": ");
        String pass=scan.next();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Pattern pattern=Pattern.compile("@\\w+");
        Matcher matcher=pattern.matcher(account[indexUser].getMail());
        while (matcher.find()) {
            if (matcher.group().toLowerCase().equals("@gmail")) properties.put("mail.smtp.host", "smtp.gmail.com");
            if (matcher.group().toLowerCase().equals("@mail")) properties.put("mail.smtp.host", "smtp.mail.ru");
        }
        properties.put("mail.smtp.port", "587");
        try {
            Session session = Session.getInstance(properties,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(fromUser, pass);
                        }
                    });
                MimeMessage message = new MimeMessage(session); // email message
                message.setFrom(new InternetAddress(fromUser)); // setting header fields

                    String toUser="";
                    for (Account i:account){
                        if (i.getRoles().toLowerCase().equals("administrator")){
                            toUser=i.getMail();
                            break;
                        }
                    }

                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toUser));
                    message.setSubject("Предложение по добавлении книги в каталог.");
                    message.setText("Пользователь "+account[indexUser].getName()+" предлагает добавить в каталог книгу: "+book);
                    Transport.send(message);
                    System.out.println("Сообщение отправлено.");
        } catch (MessagingException mex){
            System.out.println("Сообщение не отправлено.");
            mex.printStackTrace(); }
    }
}
