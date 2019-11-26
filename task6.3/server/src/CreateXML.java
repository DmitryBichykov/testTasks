
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CreateXML {

    public ArrayList<String> openXml(){
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            ArrayList <String> studentsArray =new ArrayList<>();
            Document document = documentBuilder.parse("archive.xml");
            Node root = document.getDocumentElement();
            NodeList students = root.getChildNodes();
            String studentInfo="";
            for (int i = 0; i < students.getLength(); i++) {
                Node student = students.item(i);
                if (student.getNodeType() != Node.TEXT_NODE) {
                    NodeList studProps = student.getChildNodes();
                    for(int j = 0; j < studProps.getLength(); j++) {
                        Node studProp = studProps.item(j);
                        if (studProp.getNodeType() != Node.TEXT_NODE) {
                            studentInfo+=studProp.getNodeName() + ":" + studProp.getChildNodes().item(0).getTextContent()+"\n";
                            }
                        }
                    studentInfo+="===========>>>>";
                    studentsArray.add(studentInfo);
                    studentInfo="";
                    }
               }
            return studentsArray;
        } catch (ParserConfigurationException | IOException ex) {
            ex.printStackTrace(System.out);
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addXml(String nameStudent, String dateOfBirthStudent, String adresStudent) throws TransformerException {
      try {
          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
          DocumentBuilder builder = factory.newDocumentBuilder();
          Document document = builder.parse("archive.xml");
          Node archive = document.getFirstChild();
          Element student = document.createElement("Student");
          Element studentName = document.createElement("Name");
          Element studentDateOfBirth = document.createElement("DateOfBirth");
          Element studentAdres = document.createElement("Adres");
          archive.appendChild(student);
          student.appendChild(studentName);
          studentName.appendChild(document.createTextNode(nameStudent));
          student.appendChild(studentDateOfBirth);
          studentDateOfBirth.appendChild(document.createTextNode(dateOfBirthStudent));
          student.appendChild(studentAdres);
          studentAdres.appendChild(document.createTextNode(adresStudent));
          Transformer t = TransformerFactory.newInstance().newTransformer();
          t.setOutputProperty(OutputKeys.INDENT, "yes");
          t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("archive.xml")));
      } catch (ParserConfigurationException | IOException ex) {
          ex.printStackTrace(System.out);
      } catch (org.xml.sax.SAXException e) {
          e.printStackTrace();
      }
    }

    public void changeXml(int numberStudent,String nameStudent, String dateOfBirthStudent,String adresStudent) throws TransformerException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("archive.xml");

            Node staff=document.getElementsByTagName("Student").item(numberStudent-1);
            NodeList list=staff.getChildNodes();
            Node node;
            for (int i=0;i<list.getLength();i++) {
                node=list.item(i);
                if (!nameStudent.equals("0"))
                      if (node.getNodeName().equals("Name"))  node.setTextContent(nameStudent);
                if (!dateOfBirthStudent.equals("0"))
                      if (node.getNodeName().equals("DateOfBirth")) node.setTextContent(dateOfBirthStudent);
                if (!adresStudent.equals("0"))
                      if (node.getNodeName().equals("Adres")) node.setTextContent(adresStudent);
            }
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("archive.xml")));
        } catch (ParserConfigurationException | IOException ex) {
        ex.printStackTrace(System.out);
    } catch (org.xml.sax.SAXException e) {
        e.printStackTrace();
    }
    }
}
