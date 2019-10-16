package com.metanit.draconcave.logic;

import com.metanit.draconcave.DragonCave;
import com.metanit.draconcave.HiddenTreasures;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HiddenTreasuresLogic {

    public void openBaseHiddenTreasures(DragonCave dragonCave) throws IOException {
        BufferedReader base;
        try{
            base=new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\com\\metanit\\draconcave\\logic\\"+"hiddenTreasure.txt"));
            String line;
            Pattern pattern=Pattern.compile("^\\b[A-Za-zА-Яа-я]+\\b");
            Pattern pattern1=Pattern.compile("\\b\\d+\\b");
            while((line=base.readLine())!=null) {
                Matcher matcher = pattern.matcher(line);
                Matcher matcher1 = pattern1.matcher(line);
                while (matcher.find() && matcher1.find()) {
                    dragonCave.setHiddenTreasures(new HiddenTreasures(matcher.group(), Double.parseDouble(matcher1.group())));
                }
            }
            base.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public HiddenTreasures findMostExpensiveHiddenTreasures(DragonCave dragonCave){
        double expensive=0;
        HiddenTreasures hiddenTreasures=new HiddenTreasures("",0);
        for (HiddenTreasures i:dragonCave.getHiddenTreasures()){
            if (i.getCost()>expensive){
                expensive=i.getCost();
                hiddenTreasures=i;
            }
        }
        return hiddenTreasures;
    }

    public DragonCave treasureSelectionInAmountOf(double sum,DragonCave dragonCave){
        double amountReceived=0;
        DragonCave dragonCave1=new DragonCave();
        for (HiddenTreasures i:dragonCave.getHiddenTreasures()){
            if (amountReceived+i.getCost()<=sum){
                amountReceived+=i.getCost();
                dragonCave1.setHiddenTreasures(new HiddenTreasures(i.getName(),i.getCost()));
            }
        }
        return dragonCave1;
    }
}
