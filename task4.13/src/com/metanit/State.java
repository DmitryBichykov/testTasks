package com.metanit;

import java.util.Arrays;

public class State {
    private String stateName;
    private String capital;
    private String[] regions=new String[0];
    private double areaState;
    private int index=0;

    public void setRegions(Region region) {
        regions=Arrays.copyOf(regions,regions.length+1);
        this.regions[index]=region.getRegionalCenter();
        this.areaState+=region.getAreaRegion();
        index++;
    }

    public State(String stateName) {
        this.stateName = stateName;
    }

    public void setCapital(City city) {
        this.capital = city.getCity();
    }

    public void getState(){
        System.out.println(String.format("Государство: %S\nСтолица:%s\nКоличество областей: %d\nПлощадь: %.2f тыс.км.кв.\nОбластные центры:",
                stateName,capital,index,areaState));
        for (int i=0;i<6;i++) {
            System.out.printf("%S\n", regions[i]);
        }
    }
}
