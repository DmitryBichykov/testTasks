package com.metanit;

import java.util.Arrays;

public class Region {
    private String regionalCenter;
    private double areaRegion;
    private String[] districts=new String[0];
    private int index=0;

    public Region(String nameRegion,double areaRegion) {
        this.areaRegion=areaRegion;
    }

    public void setDistricts(City city) {
        districts=Arrays.copyOf(districts,districts.length+1);
        this.districts[index] = city.getCity();
        index++;
    }

    public void setRegionalCenter(City city) {
        this.regionalCenter = city.getCity();
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public double getAreaRegion() {
        return areaRegion;
    }
}
