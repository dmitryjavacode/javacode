package ru.skillbox;

public class Dimensions {
    private final int height;
    private final int width;
    private final int lenght;
    private final int volume;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    public int getVolume() {
        return volume;
    }

    public Dimensions(int height, int width, int lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;
        this.volume = volumeCargo(height, width, lenght);
    }

    private int volumeCargo(int height, int width, int lenght){
        return height * width * lenght;
    }

    public String toString(){
        return "" + volume + " или так " + getVolume();
    }

}
