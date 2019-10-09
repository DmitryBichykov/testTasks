package com.metanit;


public class Main {

    public static void main(String[] args) {
	State state=new State("Беларусь");
	City city1=new City("Минск");
	state.setCapital(city1);
	Region region1=new Region("Бресткая",32.8);
	City city2=new City("Брест");
	region1.setRegionalCenter(city2);
	state.setRegions(region1);
        Region region2=new Region("Витебсая",40);
        City city3=new City("Витебск");
        region2.setRegionalCenter(city3);
        state.setRegions(region2);
        Region region3=new Region("Гомельская",40.4);
        City city4=new City("Гомель");
        region3.setRegionalCenter(city4);
        state.setRegions(region3);
        Region region4=new Region("Гродненская",25.1);
        City city5=new City("Гродно");
        region4.setRegionalCenter(city5);
        state.setRegions(region4);
        Region region5=new Region("Могилевская",29.1);
        City city6=new City("Могилев");
        region5.setRegionalCenter(city6);
        state.setRegions(region5);
        Region region6=new Region("Минская",39.9);
        region6.setRegionalCenter(city1);
        state.setRegions(region6);
        state.getState();

    }
}
