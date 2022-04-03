package ru.skillbox;

public class Country {
    private String nameCountry;
    private int populationCountry;
    private int areaCoutry;
    private String nameCapital;
    private int seaAccess;

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getPopulationCountry() {
        return populationCountry;
    }

    public void setPopulationCountry(int populationCountry) {
        this.populationCountry = populationCountry;
    }

    public int getAreaCoutry() {
        return areaCoutry;
    }

    public void setAreaCoutry(int areaCoutry) {
        this.areaCoutry = areaCoutry;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public int getSeaAccess() {
        return seaAccess;
    }

    public void setSeaAccess(int seaAccess) {
        this.seaAccess = seaAccess;
    }
}
