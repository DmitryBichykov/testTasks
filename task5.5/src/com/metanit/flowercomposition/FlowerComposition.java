package com.metanit.flowercomposition;

import java.util.Arrays;

public class FlowerComposition {
    private Flowers[] flowers;
    private Packaging packaging;
    private int index;

    public FlowerComposition() {
        flowers=new Flowers[0];
        index=0;
        packaging=new Packaging("");
    }

    public void addFlowers(Flowers flowers){
        this.flowers= Arrays.copyOf(this.flowers,this.flowers.length+1);
        this.flowers[index++]=flowers;
    }

    public void addPackaging(Packaging packaging){
        this.packaging=packaging;
    }

    public void showFlowerComposition() {
        System.out.print("Букет состоит из: ");
        for (Flowers i:flowers) {
            System.out.printf("%s; ", i.getName());
        }
        System.out.printf("\nУпаковка: %s",packaging.getName());
    }

    public static class Flowers {
        private String name;

        public Flowers(String name) {
            this.name = name;
        }

        private String getName() {
            return name;
        }
    }

    public static class Packaging {
        private String name;

        public Packaging(String name) {
            this.name = name;
        }

        private String getName() {
            return name;
        }
    }
}
