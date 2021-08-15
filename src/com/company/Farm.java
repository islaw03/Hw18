package com.company;

public class Farm {
    private String addres;
    private Cow[] herd;
    private Hors[] tabun;
    private Sheep[] stado;
    private String FarmName;
public Farm(){

}

    public Farm(String addres, Cow[] herd, Hors[] tabun, Sheep[] stado, String farmName) {
        this.addres = addres;
        this.herd = herd;
        this.tabun = tabun;
        this.stado = stado;
        FarmName = farmName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Cow[] getHerd() {
        return herd;
    }

    public void setHerd(Cow[] herd) {
        this.herd = herd;
    }

    public Hors[] getTabun() {
        return tabun;
    }

    public void setTabun(Hors[] tabun) {
        this.tabun = tabun;
    }

    public Sheep[] getStado() {
        return stado;
    }

    public void setStado(Sheep[] stado) {
        this.stado = stado;
    }

    public String getFarmName() {
        return FarmName;
    }

    public void setFarmName(String farmName) {
        FarmName = farmName;
    }
}
