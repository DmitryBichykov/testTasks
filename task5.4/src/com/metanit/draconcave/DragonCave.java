package com.metanit.draconcave;

import java.util.Arrays;

public class DragonCave {
    private HiddenTreasures[] hiddenTreasures;
    private int index;

    public DragonCave(){
        hiddenTreasures=new HiddenTreasures[0];
        index=0;
    }

    public void setHiddenTreasures(HiddenTreasures hiddenTreasures) {
        this.hiddenTreasures= Arrays.copyOf(this.hiddenTreasures,this.hiddenTreasures.length+1);
        this.hiddenTreasures[index++] = hiddenTreasures;
    }

    public HiddenTreasures[] getHiddenTreasures() {
        return hiddenTreasures;
    }
}
