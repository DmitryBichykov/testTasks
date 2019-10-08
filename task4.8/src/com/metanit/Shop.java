package com.metanit;

import java.util.*;

public class Shop{
    private ArrayList<Customer> customerList=new ArrayList<>();


    public void addCustomerToList(Customer customer){
       customerList.add(customer);

    }

    List<Customer> sortBySurName() {
        List<Customer>list=new ArrayList<>(customerList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        return list;
    }

    List<Customer>getListByDiapasonCreditCard(int diapasonStart,int diapasonEnd){
        List<Customer>list=new ArrayList<>();
        for (Customer i:customerList){
            if(i.getCreditCardNumber()>=diapasonStart && i.getCreditCardNumber()<=diapasonEnd){
                list.add(i);
            }
        }
        return list;
    }

}
