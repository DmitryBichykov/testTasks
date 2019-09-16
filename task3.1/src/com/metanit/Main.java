package com.metanit;

public class Main {

    public static void main(String[] args) {
	String[] array={"sumNumber","productNumbers","sortAscending","numberReplacements"};
        System.out.println("Массив с названиями переменных в camelCase:");
	for(String i:array){
        System.out.print(i+"; ");
    }
        System.out.println("\nМассив с названиями переменных в snake_case:");
	for (String i:array){
	    i=conversion(i);
        System.out.print(i+"; ");
    }
    }

    private static String conversion(String camelCase){
        String snake_case=new String();
        for (int i=0;i<camelCase.length();i++){
            if (Character.isUpperCase(camelCase.charAt(i))){
                snake_case+="_";
                snake_case+=camelCase.substring(i,i+1).toLowerCase();
            }else snake_case+=camelCase.substring(i,i+1);
        }
        return snake_case;
    }
}
