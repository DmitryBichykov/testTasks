package com.metanit.port;

public class Berth {
    private int number;
    private boolean free;

    public Berth(int number,boolean free) {
        this.number = number;
        this.free=free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public boolean isFree() {
        return free;
    }

    public int getNumber() {
        return number;
    }
}
