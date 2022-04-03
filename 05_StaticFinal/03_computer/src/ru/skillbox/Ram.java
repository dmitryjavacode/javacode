package ru.skillbox;

public class Ram {
    private final RamType ramType;
    private final int memorySize;
    private final int weight;

    public Ram(RamType ramType, int memorySize, int weight) {
        this.ramType = ramType;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public RamType getRamType() {
        return ramType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getWeight() {
        return weight;
    }
}
