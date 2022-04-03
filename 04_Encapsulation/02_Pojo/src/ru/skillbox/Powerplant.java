package ru.skillbox;

public class Powerplant {
    private String typePPlant;
    private int capacityPPlant;
    private int carbonFootprint;

    public Powerplant(String typePPlant, int capacityPPlant) {
        this.typePPlant = typePPlant;
        this.capacityPPlant = capacityPPlant;
    }

    public String getTypePPlant() {
        return typePPlant;
    }

    public void setTypePPlant(String typePPlant) {
        this.typePPlant = typePPlant;
    }

    public int getCapacityPPlant() {
        return capacityPPlant;
    }

    public void setCapacityPPlant(int capacityPPlant) {
        this.capacityPPlant = capacityPPlant;
    }

    public int getCarbonFootprint() {
        return carbonFootprint;
    }

    public void setCarbonFootprint(int carbonFootprint) {
        this.carbonFootprint = carbonFootprint;
    }
}
