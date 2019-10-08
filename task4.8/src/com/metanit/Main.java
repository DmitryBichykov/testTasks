package com.metanit;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	Shop shop=new Shop();
	shop.addCustomerToList(new Customer(100,"Иванов","Иван","Иванович","Могилев",4444,"ABK12354"));
	shop.addCustomerToList(new Customer(93,"Петров","Петр","Петрович","Минск",3333,"ABK23554"));
	shop.addCustomerToList(new Customer(110,"Яблоков","Андрей","Васильевич","Брест",8787,"ABK35847"));
	shop.addCustomerToList(new Customer(87,"Егоров","Константин","Викторович","Гомель",1010,"ABK89472"));
	shop.addCustomerToList(new Customer(125,"Воробьев","Дмитрий","Иванович","Гомель",4557,"ABK23654"));
	shop.addCustomerToList(new Customer(113,"Никифоров","Игорь","Алексеевич","Минск",3388,"ABK154874"));
	shop.addCustomerToList(new Customer(158,"Дятлов","Алесандр","Валерьевич","Кировск",3651,"ABK365147"));
	shop.addCustomerToList(new Customer(147,"Дмитриев","Алексей","Егорович","Светлогорск",9874,"ABK36547"));
	shop.addCustomerToList(new Customer(54,"Миронова","Надежда","Викторовна","Могилев",1254,"ABK36547"));
	shop.addCustomerToList(new Customer(75,"Савельева","Екатерина","Геннадьевна","Солигорск",3654,"ABK236547"));
	int operation=0;
	while (operation!=3) {
        System.out.println("Выберите операцию:");
        System.out.println("1. Вывести список покупателей в алфавитном порядке;\n" +
                "2. Вывести список покупателей, у которых номер кредитной карточки находится в заданном интервале;\n" +
                "3. Закончить работу с программой.");
        operation=scan.nextInt();
		if(operation==1){
			List<Customer> listSortBySurName=shop.sortBySurName();
			for(Customer i:listSortBySurName){
				System.out.println(i);
			}
		}
		if(operation==2){
			System.out.print("Введите начально и конечное значение номера кредитной карты:");
			int startDiapason=scan.nextInt();
			int endDiapason=scan.nextInt();
			System.out.println(String.format("Список покупателей, у которых номер кредитной карточки находится в диапазаоне от %d до %d",startDiapason,endDiapason));
			List<Customer>listSortByDiapasonCreditCard=shop.getListByDiapasonCreditCard(startDiapason,endDiapason);
			for(Customer i:listSortByDiapasonCreditCard){
				System.out.println(i);
			}
		}
		if(operation>3) System.out.println("Вы ввели недопустимое значение!");
    }
    }
}

