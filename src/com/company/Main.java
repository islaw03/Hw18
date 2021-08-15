package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep(80, 4, true, "Baran");
        Sheep sheep1 = new Sheep(77, 5, false, "kozu");
        Sheep sheep2 = new Sheep(98, 7, true, "Sheep");

        Cow cow = new Cow(159, 4, true, "Ui");
        Cow cow1 = new Cow(500, 11, true, "buka");
        Cow cow2 = new Cow(799, 33, false, "telenok");

        Hors hors = new Hors(500, 7, true, "Spirit");
        Hors hors1 = new Hors(567, 5, false, "bullzai");
        Hors hors2 = new Hors(654, 8, true, "ass");


        Farm farm = new Farm();
        farm.setAddres("Ala too");
        Sheep[] stado = {sheep, sheep1, sheep2};
        farm.setStado(stado);
        Cow[] herd = {cow, cow1, cow2};
        farm.setHerd(herd);
        Hors tabun[] = {hors, hors1, hors2};
        farm.setTabun(tabun);

        farm.setFarmName("U deda");
        System.out.println("Adress :" + farm.getAddres());
        System.out.println("owner of farm :" + farm.getFarmName());
        System.out.println(herd.length + "cows in farm \n " + stado.length + "sheep in farm \n " + tabun.length + "hors in farm");
        System.out.println(Arrays.toString(farm.getHerd()));
        System.out.println(Arrays.toString(farm.getStado()));
        System.out.println(Arrays.toString(farm.getTabun()));

    }
}
