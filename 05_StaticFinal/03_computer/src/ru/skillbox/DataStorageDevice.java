package ru.skillbox;

public class DataStorageDevice {
    private final DataStorageType storageType;
    private final int memorySize;
    private final int weight;

    public DataStorageDevice(DataStorageType storageType, int memorySize, int weight) {
        this.storageType = storageType;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public DataStorageType getType() {
        return storageType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getWeight() {
        return weight;
    }
}
