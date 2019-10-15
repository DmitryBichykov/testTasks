package com.metanit;

import java.util.Arrays;

public class Payment {
    private Good[] goods;
    private double costGoods;
    private int indexGoods;

    public Payment() {
        this.goods=new Good[0];
        costGoods=0;
        indexGoods=0;
    }

    public void addGoods(Good goods) {
        this.goods=Arrays.copyOf(this.goods,this.goods.length+1);
        this.goods[indexGoods++] = goods;
        costGoods+=goods.getCost();
    }

    public Good[] getGoods() {
        return goods;
    }

    public double getCostGoods() {
        return costGoods;
    }

    public static class Good{
        private String name;
        private double cost;

        public Good(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }
    }
}
