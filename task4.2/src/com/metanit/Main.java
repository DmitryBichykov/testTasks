package com.metanit;

public class Main {

    public static void main(String[] args) {
        Test2 test1=new Test2();
        test1.setName("Иван");
        test1.setAge(25);
        System.out.println("Меня зовут "+test1.getName()+", мне "+test1.getAge()+" лет");
        Test2 test2 = new Test2("Игорь", 37);
        System.out.println("Меня зовут "+test2.getName()+", мне "+test2.getAge()+" лет");
    }
}

    class Test2{
    private String name;
    private int age;

    public Test2(){

    }

    public Test2(String name, int age){
        this.name=name;
        this.age=age;
    }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

