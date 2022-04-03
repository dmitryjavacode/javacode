package ru.skillbox;

public class Keyboard {
    private final KeyboardType keyboardType;
    private final boolean keyboardLight;
    private final int weight;

    public Keyboard(KeyboardType keyboardType, boolean keyboardLight, int weight){
        this.keyboardType = keyboardType;
        this.keyboardLight = keyboardLight;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public boolean isKeyboardLight() {
        return keyboardLight;
    }

    public int getWeight() {
        return weight;
    }
}
