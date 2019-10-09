package com.metanit;

public class District {
    private String nameDistrict;

    public District(City city) {
        this.nameDistrict = city.getCity();
    }
}
