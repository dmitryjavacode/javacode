package ru.skillbox;

public class Cpu {
    private final int cpuFrequency;
    private final int coresNumber;
    private final String manufacturer;
    private final int weight;

    public Cpu(int cpuFrequency, int coresNumber, String manufacturer, int weight) {
        this.cpuFrequency = cpuFrequency;
        this.coresNumber = coresNumber;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getCpuFrequency() {
        return cpuFrequency;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }
}
