package com.metanit;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Student[] student=new Student[10];
	for (int i=0;i<10;i++){
        System.out.print("Введите номер группы студена: ");
        int numberGroup=scan.nextInt();
        System.out.print("Введите фамилию и инициалы студента: ");
        String SurnameAndInitials=scan.next();
        int[] studentGrades=new int[5];
        for (int j=0;j<5;j++) {
            System.out.print("Введите оценку студента №" + (j + 1) + ": ");
            studentGrades[j]=scan.nextInt();
        }
        student[i]=new Student(numberGroup,SurnameAndInitials,studentGrades);
    }
        System.out.println("Студенты отличники:");
	for (int i=0;i<10;i++){
	    student[i].excellentStudents();
    }
    }
}

class Student{
    private String surnameAndInitials;
    private int numberGroup;
    private int[] academicPerformance;

    public Student(int numberGroup, String surnameAndInitials,int[] academicPerformance){
        this.numberGroup=numberGroup;
        this.surnameAndInitials=surnameAndInitials;
        this.academicPerformance=academicPerformance;
    }

    public void excellentStudents(){
        boolean excellent=true;
        for (int i:academicPerformance){
            if (i<9){
                excellent=false;
                break;
            }
        }
        if (excellent) System.out.println("Группа "+numberGroup+" "+surnameAndInitials);
    }

}
