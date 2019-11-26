package client;


import java.io.*;
import java.net.Socket;

public class Client {

    public void displayAllStudents(){
    try(Socket socket = new Socket("127.0.0.1", 3345);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
        System.out.println("Connected to server.");
        String nameStudent="allStudents";
        writer.write("findStudent");
        writer.newLine();
        writer.write(nameStudent);
        writer.newLine();
        writer.flush();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public void displayStudent(String nameStudent){
        try(Socket socket = new Socket("127.0.0.1", 3345);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            System.out.println("Connected to server.");
            writer.write("findStudent");
            writer.newLine();
            writer.write(nameStudent);
            writer.newLine();
            writer.flush();
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(String nameStudent,String dateOfBirthStudent, String adresStudent){
        try(Socket socket = new Socket("127.0.0.1", 3345);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            System.out.println("Connected to server.");
            writer.write("addStudent");
            writer.newLine();
            writer.write(nameStudent);
            writer.newLine();
            writer.write(dateOfBirthStudent);
            writer.newLine();
            writer.write(adresStudent);
            writer.newLine();
            writer.flush();
            System.out.println(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeStudent(int numberStudent, String nameStudent,String dateOfBirthStudent, String adresStudent){
        try(Socket socket = new Socket("127.0.0.1", 3345);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            System.out.println("Connected to server.");
            writer.write("changeStudent");
            writer.newLine();
            writer.write(numberStudent);
            writer.write(nameStudent);
            writer.newLine();
            writer.write(dateOfBirthStudent);
            writer.newLine();
            writer.write(adresStudent);
            writer.newLine();
            writer.flush();
            System.out.println(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
