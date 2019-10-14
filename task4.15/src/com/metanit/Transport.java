package com.metanit;

import java.util.Arrays;

public class Transport {
    private String transport;
    private Food[] foods=new Food[0];
    private int index=0;

    public Transport(String transport) {
        this.transport = transport;
    }

    public void setFoods(Food foods) {
        this.foods=Arrays.copyOf(this.foods,this.foods.length+1);
        this.foods[index] = foods;
        index++;
    }

    public String getTransport() {
        return transport;
    }
}
