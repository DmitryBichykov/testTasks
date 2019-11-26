import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(3345)) {
            System.out.println("Server started.");
            while (true)
                try (Socket socket = server.accept();
                     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                     BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    String operation = reader.readLine();
                    CreateXML createXML = new CreateXML();
                    if (operation.equals("findStudent")) {
                        String nameStudent = reader.readLine();
                        ArrayList<String> studentsArray = createXML.openXml();
                        if (nameStudent.equals("allStudents")) {
                            writer.write("Список студентов:");
                            writer.newLine();
                            int numberStudent=1;
                            for (String i : studentsArray) {
                                writer.write((numberStudent++)+". "+i);
                                writer.newLine();
                            }
                        } else {
                            Pattern pattern = Pattern.compile(nameStudent.toLowerCase());
                            Matcher matcher;
                            writer.write("Результат поиска в архиве:");
                            writer.newLine();
                            for (String i : studentsArray) {
                                matcher = pattern.matcher(i.toLowerCase());
                                while (matcher.find()) {
                                    writer.write(i);
                                    writer.newLine();
                                }
                            }
                        }
                        writer.flush();
                    }
                    if (operation.equals("addStudent")){
                        String nameStudent = reader.readLine();
                        String dateOfBirthStudent=reader.readLine();
                        String adresStudent=reader.readLine();
                        createXML.addXml(nameStudent,dateOfBirthStudent,adresStudent);
                        writer.write("Произведено добавение нового студента!");
                        writer.flush();
                    }
                    if (operation.equals("changeStudent")){
                        int numberStudent = reader.read();
                        String nameStudent = reader.readLine();
                        String dateOfBirthStudent=reader.readLine();
                        String adresStudent=reader.readLine();
                        createXML.changeXml(numberStudent,nameStudent,dateOfBirthStudent,adresStudent);
                        writer.write("Внесены извенения в архив!");
                        writer.flush();
                    }
                }
                }catch (Exception e) {
                     e.printStackTrace();
                }
    }
}
