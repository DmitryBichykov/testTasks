package com.metanit;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private String bankAccountNumber;

    public Customer (int id,String surname,String name,String patronymic,String address,int creditCardNumber,String bankAccountNumber){
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.address=address;
        this.creditCardNumber=creditCardNumber;
        this.bankAccountNumber=bankAccountNumber;

    }

    public String getSurname() {
        return surname;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\tФамилия: %s\tИмя: %s\tОтчество: %s\tАдрес: %s\tНомер кредитной карты: %s\tНомер банковского счета: %s",
                id,surname,name,patronymic,address,creditCardNumber,bankAccountNumber);
    }
}

